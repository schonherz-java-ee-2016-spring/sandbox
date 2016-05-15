package hu.schonherz.java.training.hw7.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hu.schonherz.java.training.hw7.dao.UserDao;
import hu.schonherz.java.training.hw7.dao.mapper.ProductMapper;
import hu.schonherz.java.training.hw7.dao.mapper.UserMapper;
import hu.schonherz.java.training.hw7.dto.Product;
import hu.schonherz.java.training.hw7.dto.User;

//Repository tells spring that this class is a DAO
@Repository
public class UserDaoImpl implements UserDao {
	
	// Autowired tells spring that this is a dependency for this class that should be injected.
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addUser(User user) {
		return addUser(user.getName());
	}
	
	@Override
	public boolean addUser(String name) {
		int res = jdbcTemplate.update("INSERT INTO public.\"User\" (name) VALUES (?);", name);
		return res == 0 ? false : true;
	}
	
	@Override
	public boolean deleteUser(User user) {
		return deleteUser( user.getName());
	}
	
	@Override
	public boolean deleteUser(String name) {
		int res = jdbcTemplate.update("DELETE FROM public.\"User\" name=?;", name );
		return res == 0 ? false : true;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		users = jdbcTemplate.query("SELECT id, name, password FROM public.\"User\";", new UserMapper() );
		return users;
	}
	
	@Override
	public User getUser(User user) {
		User user_loc = null;
		user_loc = getUser(user.getName(), user.getPassword());		
		return user_loc;
	}

	/**
	 * Note: Uses PreparedStatement.
	 * */
	@Override
	public User getUser( String name, String password ) {
		User user = null;
//		System.out.println("SZAER");
		user = jdbcTemplate.queryForObject("SELECT * FROM public.\"User\" WHERE name=? AND password=?;", new UserMapper() );
	
//		if( user == null ){
//			System.out.println("ELVERZIK");
//		} else {
//			System.out.println( user.getName() + " " + user.getPassword());
//		}
		return user;
	}
	
	@Override
	public List<Product> getOrdersOfUser(User user) {
		return getOrdersOfUser( user.getName());
	}

	/**
	 * Note: Uses PreparedStatement.
	 * */
	@Override
	public List<Product> getOrdersOfUser(String name) {
		List<Product> products = null;
		
		String sql = "SELECT P.id, P.name FROM "
				+ "public.\"Product\" AS P INNER JOIN public.\"Order\" AS O ON "
				+ "P.id = O.product_id INNER JOIN public.\"User\" AS U ON "
				+ "O.user_id = U.id WHERE U.name=?;";
		
		products = jdbcTemplate.query(sql, new ProductMapper(), name );

		return products;
	}
}
