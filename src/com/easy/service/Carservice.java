package com.easy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easy.entity.Car;
import com.easy.entity.Level;
import com.easy.entity.brand;
import com.easy.entity.caruser;
import com.easy.entity.page;
import com.easy.mapper.Carmapper;

@Service
public class Carservice {
	
	@Autowired
	Carmapper cm;
	
	//登录
	public List<caruser> login() {
		
		List<caruser> list = cm.select(null);
		return list;
	}
	public int selectIdByName(String u) {
		
		return  cm.selectIdByName(u);
		
	}
	
	//查询
	public List<Car> selectCar(String brand){
		
		List<Car> list = cm.selectCar(brand);
		return list;
	}
	
	public List<brand> selectbrand(){
		
		List<brand> list = cm.selectbrand();
		return list;
	}
	public List<Level> selectlevel(){
		List<Level> list = cm.selectlevel();
		return list;
	}
	
	
	
	public List<Car> selectByPage(int currentpage){
		
		//根据画面传入的页码数计算当前页第一条数据的行号和最后一条数据的行号
		int last = currentpage * page.count;
		int first = last - (page.count - 1);
		List<Car> list = cm.selectBypage(first,last);
		
		return list;
	}
	
	
	//添加
	public int insertCar(Car car) {
		
		return cm.insertCar(car);
		
	}
	//修改
	public int updateCar(Car car) {
		return cm.updateCar(car);
	}
	public List<Car> selectID(int id){
		List<Car> list = cm.selectID(id);
		return list;
	}
	
	//删除
	public void deleteCar(int id) {
		cm.deleteCar(id);
	}
	
}
