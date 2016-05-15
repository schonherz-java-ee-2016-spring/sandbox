package hu.schonerz.java.training.hw7.service;

import java.util.List;

import hu.schonerz.java.training.hw7.vo.ProductVo;

public interface ProductService {

	// This function needed by the task
	List<ProductVo> getAllProducts();

	// This function needed by the task
	void addProuduct( ProductVo product );
	
	// TODO add more functionality
	
	ProductVo getProduct( String name );
	
}
