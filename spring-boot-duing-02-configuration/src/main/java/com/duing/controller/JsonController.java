package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Student;
import com.duing.bean.Vegetables;
import com.duing.config.FoodConfig;
import com.duing.config.StudentConfig;
import com.duing.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ResrController注解是@Controller和@ResponseBody的联合
 * 用@RestController是为了减少代码行数
 *
 */
@RestController
public class JsonController {


//    @Value("${foot.rice}")
//    private String rice;
//    @Value("${foot.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public String json(){
        return "Hello Json";
    }

    @RequestMapping("/food")
    public Food getFood(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables(vegetablesConfig.getPotato(),vegetablesConfig.getEggplant(),vegetablesConfig.getGreenpeper());
        return vegetables;
    }

    @Autowired
    private StudentConfig studentConfig;

    @RequestMapping("/student")
    public Student student(){
        Student student = new Student();
        student.setAge(studentConfig.getAge());
        student.setName(studentConfig.getName());
        student.setSex(studentConfig.getSex());
        student.setWeight(studentConfig.getWeight());
        return student;
    }

    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuilder builder = new StringBuilder();
        builder.append(username);
        builder.append("--");
        builder.append(password);
        return builder.toString();
    }
}
