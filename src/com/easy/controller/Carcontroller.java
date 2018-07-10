package com.easy.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.easy.entity.Car;
import com.easy.entity.Level;
import com.easy.entity.brand;
import com.easy.service.Carservice;

@Controller
public class Carcontroller {
	
	@Autowired
	Carservice cs;
	
	@RequestMapping("login")
	public String login(@RequestParam("username") String name,@RequestParam("password") String word) {
		 cs.login();
//		 判断是用户还是管理员
		 int c = cs.selectIdByName(name);
		 if(c == 0)
		 {
			 return "select";
		 }
		 else{
			 return "main";
		 }
	}
	@RequestMapping("gologin")
	public String gologin() {
		System.out.println("跳转到登录页面");
		return "login";
	}
	
	
	@RequestMapping("select")
	public String selectCar(String brand,Model m) {
		System.out.println("执行查询");
		if(brand.isEmpty()) {
			System.out.println("不允许为空");
			//执行弹出框
			return "";
			
		}else {
			List<Car> list = cs.selectCar(brand);
			m.addAttribute("car", list);
		}
		return "select";
	}
	
	@RequestMapping("spage")
	public String selectPage(int currentpage,Model m) {
		
		//controller接到页码后应该传到service层
		m.addAttribute("car",cs.selectByPage(currentpage));
		return "select";
	}
	
	
	
	
	@RequestMapping("insert")
	public String insertCar(Car car,Model m,@RequestParam("file") MultipartFile file) {
		System.out.println("执行增加");
		
		//想要存储上传文件的路径
		String path = null;
		System.out.println(car.getB_id());
		//从上传的文件流中提取文件原始的名字
		String originaName = file.getOriginalFilename();
		if(!car.getFile().isEmpty()) {
			//从源文件名中提取文件的尾缀（文件类型）
			String suffix = originaName.substring(originaName.lastIndexOf("."));
			System.out.println(suffix);
			//为源文件起一个不会重复的新名字
			String newName = UUID.randomUUID() + suffix;
			//将存储文件路径与文件名进行拼接
			String newPath = path + newName;
			//利用file对象抽象的表示，上一步中所要生成的文件
			File file2 = new File(newPath);
			try {
				file.transferTo(file2);
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		car.setImage(originaName);
		int c = cs.insertCar(car);
		//返回select需要重新查询数据
		List<Car> list = cs.selectID(c);
		m.addAttribute("car", list);
		//错误处理
		m.addAttribute("error", c);
		return "select";
	}
	@RequestMapping("goinsert")
	public String insert(Model m) {
		System.out.println("下拉框执行查询");
		List<brand> brand = cs.selectbrand();
//		System.out.println(brand.toString());
		m.addAttribute("brand", brand);
		List<Level> level = cs.selectlevel();
		m.addAttribute("level", level);
		return "addCar";
	}
	@RequestMapping("updateByid")
	public String updateCar(Car car,Model m,@RequestParam("file") MultipartFile file) {
		System.out.println("执行修改");
		//想要存储上传文件的路径
		String path = null;
		//从上传的文件流中提取文件原始的名字
		String originaName = file.getOriginalFilename();
		if(!car.getFile().isEmpty()) {
			//从源文件名中提取文件的尾缀（文件类型）
			String suffix = originaName.substring(originaName.lastIndexOf("."));
			System.out.println(suffix);
			//为源文件起一个不会重复的新名字
			String newName = UUID.randomUUID() + suffix;
			//将存储文件路径与文件名进行拼接
			String newPath = path + newName;
			//利用file对象抽象的表示，上一步中所要生成的文件
			File file2 = new File(newPath);
			try {
				file.transferTo(file2);
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		car.setImage(originaName);
				
		int c = cs.updateCar(car);
		List<Car> list = cs.selectID(c);
		m.addAttribute("car", list);
		return "select";
	}
	@RequestMapping("goupdate")
	public String goupdateCar(Model m) {
		System.out.println("下拉框执行查询");
		List<brand> brand = cs.selectbrand();
		System.out.println(brand.toString());
		m.addAttribute("brand", brand);
		List<Level> level = cs.selectlevel();
		m.addAttribute("level", level);
		return "updateCar";
	}
	@RequestMapping("deleteByid")
	public String delete(@RequestParam("idCar") int id) {
		System.out.println("执行删除");
		cs.deleteCar(id);
		return "select";
	}

}
