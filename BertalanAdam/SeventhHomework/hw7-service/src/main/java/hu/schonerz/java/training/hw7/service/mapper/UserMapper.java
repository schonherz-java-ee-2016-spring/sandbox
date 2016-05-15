package hu.schonerz.java.training.hw7.service.mapper;

import java.util.ArrayList;
import java.util.List;

import hu.schonerz.java.training.hw7.vo.UserVo;
import hu.schonherz.java.training.hw7.dto.User;

// Convert DTO to VO and vice versa.
public class UserMapper {
	
	public static UserVo toVo( User user ){
		UserVo uvo = new UserVo();
		uvo.setName(user.getName());
		uvo.setPassword(user.getPassword());
		return uvo;
	}
	
	public static List<UserVo> toVo(List<User> users) {
		List<UserVo> uvos = new ArrayList<>();
		for (User user : users) {
			uvos.add( toVo(user) );
		}
		return uvos;
	}
	
	public static User toDto( UserVo user ){
		User u = new User();
		u.setPassword(user.getPassword());
		u.setName(user.getName());
		return u;
	}
	
	public static List<User> toDto(List<UserVo> uvos) {
		List<User> users = new ArrayList<>();
		for (UserVo uvo : uvos) {
			users.add(toDto(uvo));
		}
		return users;
	}

}
