package hu.schonerz.java.training.hw7.service;


import java.util.List;

import hu.schonerz.java.training.hw7.vo.UserVo;

public interface UserService {
	
	// This function needed by the task
	List<UserVo> getAllUsers();

	// This function needed by the task
	void addUser( UserVo user );
	
	boolean validate( UserVo user );

}
