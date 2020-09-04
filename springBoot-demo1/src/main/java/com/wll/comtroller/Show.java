package com.wll.comtroller;

import com.wll.entity.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Show {
    @RequestMapping("/show")
    public String show(){
        return "hello wll";
    }

    /**
     * 获取json对象
     * @return
     */
    @RequestMapping("/car")
    public Car getCar(){

        Car car=new Car(2,"wll",1000.99f,new Date(),"hello","heihei");
        return  car;
    }

    /**
     * 请求路径传参
     * @return
     */
    @RequestMapping("/car2/{name}")
    public Car getCar2(Integer id, @PathVariable("name") String name){
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");
        return  car;
    }

    /**
     * 取多个对象json
     * @return
     */
    @RequestMapping("/cars")
    public List<Car> Carlist(){

        Car car1=new Car(1,"1",1000.99f,new Date(),"hello","heihei");
        Car car2=new Car(2,"2",1000.99f,new Date(),"hello","heihei");
        Car car3=new Car(3,"3",1000.99f,new Date(),"hello","heihei");
        Car car4=new Car(4,"4",1000.99f,new Date(),"hello","heihei");
        Car car5=new Car(5,"5",1000.99f,new Date(),"hello","heihei");
        List<Car> list=new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        return  list;
    }

    /**
     * 接收封装对象参数
     * @param car
     * @return
     */
    @RequestMapping("/car3")
    public Car getCarById(Car car) {
        System.out.println(car);
        return car;

    }

    /**
     * PathVariable参数校验
     * @param name
     * @return
     */
    @RequestMapping("/getcar5/{name:[a-zA-Z]{3}}")
    public Car getCarById(@PathVariable(name = "name") String name) {
        Car car = new Car();
        car.setId(999);
        car.setName(name);
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");
        return car;
    }


}
