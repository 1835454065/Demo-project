package com.wll.controller;


import com.wll.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class MyController {
    @GetMapping("/first")
    public String indexPage(Model m){
        String word="admin1";
        List<User> list=new ArrayList<>();
        User user1=new User(Long.valueOf("1"),"wll",23);
        User user2=new User(Long.valueOf("2"),"jj",20);
        list.add(user1);
        list.add(user2);
        Map<String, Object> map = new HashMap<>();
        map.put("src1", "d.jpg");
        m.addAttribute("word",word);
        m.addAttribute("map",map);
        m.addAttribute("users",list);
        return "index";

    }


    @GetMapping("/inObj")
    public String inObj(Model model) {
        // 日期时间
        Date date = new Date();
        model.addAttribute("date", date);
        // 小数的金额
        double price = 128.5678;
        model.addAttribute("price", price);

        // 定义大文本
        String str1 = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。"
                + "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。"
                + "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的";

        model.addAttribute("str1", str1);

        // 定义字符串
        String str2 = "JAVA-offcn";
        model.addAttribute("str2", str2);

        return "index2";
    }
}
