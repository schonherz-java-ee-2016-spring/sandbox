package hu.schonherz.java.training.hw7.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hu.schonherz.java.training.hw7.dao.OrderDao;
import hu.schonherz.java.training.hw7.dao.mapper.OrderMapper;
import hu.schonherz.java.training.hw7.dto.Order;

// Repository tells spring that this class is a DAO
@Repository
public class OrderDaoImpl implements OrderDao {
	
	// Autowired tells spring that this is a dependency for this class that should be injected.
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean addOrder( Order order ){
		return addOrder( order.getUser_id(), order.getProduct_id());
	}

	@Override
	public boolean addOrder(int user_id, int product_id) {
		int res = jdbcTemplate.update("INSERT INTO public.\"Order\" (user_id, product_id) VALUES (?,?);", user_id, product_id);
		return res == 0 ? false : true;
	}

	@Override
	public boolean deleteOrder( Order order ){
		return deleteOrder(order.getUser_id(), order.getProduct_id());
	}
	
	@Override
	public boolean deleteOrder( int user_id, int product_id ) {
		int res = jdbcTemplate.update("DELETE FROM public.\"Order\" WHERE user_id=? AND product_id=?;", user_id, product_id);
		return res == 0 ? false : true;
	}

	/**
	 * Note: Uses Statement.
	 * */
	@Override
	public List<Order> getAllOrders() {
		List<Order> orders = null;
		orders = jdbcTemplate.query("SELECT * FROM public.\"Order\";", new OrderMapper() );
		return orders;
	}
	
	
	@Override
	public Order getOrder( Order order ) {
		Order order_loc = null;
		order_loc = getOrder( order.getUser_id(), order.getProduct_id());
		return order_loc;
	}

	/**
	 * Note: Uses PreparedStatement.
	 * */
	@Override
	public Order getOrder(int user_id, int product_id) {
		Order order = null;
		order = jdbcTemplate.queryForObject("SELECT * FROM public.\"Order\" WHERE user_id=? AND product_id=?;", new OrderMapper());
		return order;
	}
}
