package com.wll.service.Impl;

import com.sun.scenario.effect.Identity;
import com.wll.dao.Userdao;
import com.wll.entity.User;
import com.wll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    Userdao userdao;
    @Override
    public List<User> getUserList() {
        return userdao.findAll();
    }

    @Override
    public void createUser(User user) {
        userdao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userdao.findById(id).get();
    }

    @Override
    public void updateUser(User user) {
        userdao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userdao.deleteById(id);
    }
}
