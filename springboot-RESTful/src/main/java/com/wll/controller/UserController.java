package com.wll.controller;

import com.wll.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	private List<User> listUser = new ArrayList<User>();
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	@PostMapping("/")
	@ApiOperation(notes = "新增用户信息",value = "新增")
	@ApiImplicitParam(name = "user", value = "用户信息实体user", required = true, dataType = "User")
	public String createUser(User user) {
		listUser.add(user);
		return "success";
	}
	
	/**
	 *  获取全部用户信息
	 * @return
	 */
	@GetMapping("/")
	public List<User> getUserList(){
		return listUser;
	}
	
	/**
	 * 获取指定id用户信息
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id")Long id) {
		for (User user : listUser) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 更新指定id用户信息
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/{id}")
	public String updateUser(@PathVariable("id") Long id, User user) {
		for (User temp : listUser) {
			if(temp.getId() == id) {
				temp.setName(user.getName());
				temp.setAge(user.getAge());
			}
		}
		return "success";
	}
	
	/**
	 * 删除指定id用户
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		listUser.remove(getUser(id));
		return "success";
	}
	
}