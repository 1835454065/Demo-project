package com.wll.controller;

import com.wll.entity.User;
import com.wll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sjt")
public class Mycontroller {
    @Autowired
    UserService userService;
    /***
     * 获取全部用户信息
     *
     * @return
     */
    @GetMapping("/")
    public String getUserList(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList",userList);
        return "user/list";
    }

    /***
     * 跳转到新增用户界面
     *
     * @param user
     * @return
     */
    @RequestMapping("/toAdd")
    public String toadd(User user) {
        return "user/userAdd";
    }

    /***
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping("/add")
    public String createUser(User user) {
        userService.createUser(user);
        return "redirect:/sjt/";
    }

    @RequestMapping("/toEdit/{id}")
    public String toEdit(Model model, @PathVariable("id") Long id) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/sjt/";
    }

    /***
     * 删除指定id用户
     *
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/sjt/";

    }
}
