package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    public String index(Model model){
        Person single=new Person("aa",11);
        List<Person> people=new ArrayList<Person>();

        Person p1=new Person("xx",11);
        Person p2=new Person("yy",12);
        Person p3=new Person("zz",13);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        //往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到，
        //类似于request.setAttribute("sts",sts)效果一样
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
