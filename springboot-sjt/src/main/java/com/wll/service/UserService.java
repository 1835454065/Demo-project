package com.wll.service;

import com.wll.dao.Userdao;
import com.wll.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(User user);
    //删除指定id用户
    public void deleteUser(Long id);

}
