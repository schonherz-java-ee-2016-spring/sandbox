package hu.schonerz.java.training.hw7.service.mapper;

import java.util.ArrayList;
import java.util.List;

import hu.schonerz.java.training.hw7.vo.ProductVo;
import hu.schonherz.java.training.hw7.dto.Product;

//Convert DTO to VO and vice versa.
public class ProductMapper {

	public static ProductVo toVo( Product product ){
		ProductVo pvo = new ProductVo();
		pvo.setId(product.getId());
		pvo.setName(product.getName());
		return pvo;
	}
	
	public static List<ProductVo> toVo(List<Product> products) {
		List<ProductVo> pvos = new ArrayList<>();
		for (Product product : products) {
			pvos.add( toVo(product) );
		}
		return pvos;
	}
	
	public static Product toDto( ProductVo pvo ){
		Product product = new Product();
//		product.setId(pvo.getId());
		product.setName(pvo.getName());
		return product;
	}
	
	public static List<Product> toDto(List<ProductVo> pvos) {
		List<Product> products = new ArrayList<>();
		for (ProductVo pvo : pvos) {
			products.add(toDto(pvo));
		}
		return products;
	}
}
