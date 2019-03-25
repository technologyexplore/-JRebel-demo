package cn.yxh.sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.yxh.sys.dao.UserMapper;
import cn.yxh.sys.entity.User;

@RestController
@RequestMapping("/api/system")
public class UserController {
	@Autowired
	UserMapper userMapper;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value = { "/test" }, method = RequestMethod.GET)
	public String test() {
		System.out.println("tttttttttttttttttttttttttt");
		
		return "cesgiutewqeqtdjowqhoiqrh";
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public Map<String, Object> login() {
//		System.out.println("yyyyyyyyyyyyyyyy");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		Map<String, Object> map = new HashMap<>();
//		map.put("username", username);
//		map.put("password", password);
//		Map<String, Object> list = userMapper.login(map);
		return new HashMap<>();
	}

	@RequestMapping(value = { "/selectUserByName" }, method = RequestMethod.GET)
	public List<User> selectUserByName(String name) {
		return userMapper.selectUserByName(name);
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST)
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@RequestMapping(value = { "/updateUser" }, method = RequestMethod.POST)
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@RequestMapping(value = { "/deleteUser" }, method = RequestMethod.POST)
	public void deleteUser(String id) {
		userMapper.deleteUser(Integer.parseInt(id));
	}
}
