package com.wll.service.Impl;

import com.wll.entity.User;
import com.wll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	// SpringBoot提供的数据库操作类
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public List<User> getUserList() {
		String sql="select * from t_user";
		List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
		return users;
	}

	@Override
	public void createUser(User user) {

	}

	@Override
	public User getUser(Long id) {
		return null;
	}

	@Override
	public void updateUser(Long id, User user) {

	}

	@Override
	public void deleteUser(Long id) {

	}
}