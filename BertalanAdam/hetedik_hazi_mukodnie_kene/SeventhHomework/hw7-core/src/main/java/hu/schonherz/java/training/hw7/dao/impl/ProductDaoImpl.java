package hu.schonherz.java.training.hw7.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hu.schonherz.java.training.hw7.dao.ProductDao;
import hu.schonherz.java.training.hw7.dao.mapper.ProductMapper;
import hu.schonherz.java.training.hw7.dto.Product;

//Repository tells spring that this class is a DAO
@Repository
@Lazy(true)
public class ProductDaoImpl implements ProductDao {
	
	// Autowired tells spring that this is a dependency for this class that should be injected.
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean addProduct(Product product) {
		return addProduct(product.getName());
	}

	@Override
	public boolean addProduct(int id, String name) {
		int res = jdbcTemplate.update("INSERT INTO public.\"Product\" (id, name) VALUES (?,?);", id, name);
		return res == 0 ? false : true;
	}
	
	@Override
	public boolean addProduct(String name) {
		int res = jdbcTemplate.update("INSERT INTO public.\"Product\" (name) VALUES (?);", name);
		return res == 0 ? false : true;
	}

	/**
	 * Note: Uses PreparedStatement.
	 * */
	@Override
	public boolean updateProduct(Product product) {
		int res = jdbcTemplate.update("UPDATE public.\"Product\" SET name=? WHERE id=?;", product.getName(), product.getId() );
		return res == 0 ? false : true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		return deleteProduct(product.getId(), product.getName());
	}
	
	@Override
	public boolean deleteProduct(String name) {
		int res = jdbcTemplate.update("DELETE FROM public.\"Product\" WHERE name=?;", name);
		return res == 0 ? false : true;
	}
	
	@Override
	public boolean deleteProduct(int id, String name) {
		int res = jdbcTemplate.update("DELETE FROM public.\"Product\" WHERE id=? OR name=?;", id, name);
		return res == 0 ? false : true;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = null;
		products = jdbcTemplate.query("SELECT id, name FROM public.\"Product\";", new ProductMapper() );
		return products;
	}
	
	@Override
	public Product getProduct(Product product) {
		Product product_loc = null;
		product_loc = getProduct(product.getId(), product.getName());
		return product_loc;
	}

	/**
	 * Note: Uses PreparedStatement.
	 * */
	@Override
	public Product getProduct(int id, String name) {
		Product product = null;
		product = jdbcTemplate.queryForObject("SELECT * FROM public.\"Product\" WHERE id=? AND name=?;", new ProductMapper() );
		return product;
	}
}
