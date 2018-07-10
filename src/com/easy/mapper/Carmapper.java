package com.easy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.easy.entity.Car;
import com.easy.entity.Level;
import com.easy.entity.brand;
import com.easy.entity.caruser;

public interface Carmapper {

		//登录
		 List<caruser> select(caruser u);
		 int selectIdByName(String username);
		 
		 
		//查找
		 List<Car> selectCar(@Param("id") String brand);
		 List<Car> selectBypage(@Param("first")int first,@Param("last")int last);
		 
		 //增加
		 int insertCar(Car car);
		 List<brand> selectbrand();
		 List<Level> selectlevel();
		 
		 //删除
		 int deleteCar(int id);
		 
		 //修改
		 int updateCar(Car car);
		 List<Car> selectID(int id);
		 
}
