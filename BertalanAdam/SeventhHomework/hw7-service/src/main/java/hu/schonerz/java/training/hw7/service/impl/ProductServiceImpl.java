package hu.schonerz.java.training.hw7.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.schonerz.java.training.hw7.service.ProductService;
import hu.schonerz.java.training.hw7.service.mapper.ProductMapper;
import hu.schonerz.java.training.hw7.vo.ProductVo;
import hu.schonherz.java.training.hw7.dao.ProductDao;
import hu.schonherz.java.training.hw7.dto.Product;

//Tells spring that this class is a service class.
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductVo> getAllProducts() {
		List<Product> products = productDao.getAllProducts();
		return ProductMapper.toVo(products);
	}

	@Override
	public void addProuduct(ProductVo product) {
		Product product_loc = ProductMapper.toDto(product);
		productDao.addProduct(product_loc);
	}

	@Override
	public ProductVo getProduct(String name) {
		Product prd = new Product();
		prd.setName(name);
		Product product = productDao.getProduct(prd);
		return ProductMapper.toVo(product);
	}

}
