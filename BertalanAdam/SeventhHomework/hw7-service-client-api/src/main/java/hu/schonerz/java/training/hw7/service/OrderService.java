package hu.schonerz.java.training.hw7.service;

import hu.schonerz.java.training.hw7.vo.ProductVo;
import hu.schonerz.java.training.hw7.vo.UserVo;

public interface OrderService {

	// This function needed by the task
	void addOrder( UserVo user, ProductVo product );
	
	void addOrder( int user_id, int product_id );
	
}
