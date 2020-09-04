package com.wll.conteoller;

import com.wll.entity.User;
import com.wll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Myuser")
public class Usercontroller {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public List<User> findAll(){
        return  userService.getUserList();
    }
}
