package hu.schonerz.java.training.hw7.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.schonerz.java.training.hw7.service.UserService;
import hu.schonerz.java.training.hw7.service.mapper.UserMapper;
import hu.schonerz.java.training.hw7.vo.UserVo;
import hu.schonherz.java.training.hw7.dao.UserDao;
import hu.schonherz.java.training.hw7.dto.User;

//Tells spring that this class is a service class.
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserVo> getAllUsers() {
		List<User> users = userDao.getAllUsers();
		return UserMapper.toVo(users);
	}

	@Override
	public void addUser(UserVo user) {
		User user_loc = UserMapper.toDto(user);
		userDao.addUser(user_loc);
	}

	@Override
	public boolean validate(UserVo user) {
		System.out.println("FOS");
//		User user_loc = UserMapper.toDto(user);
//
//		User u = userDao.getUser(user_loc);
//
//		if (u == null) {
//			return false;
//		} else {
//			return true;
//		}
		return false;
	}

}
