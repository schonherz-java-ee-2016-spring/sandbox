package hu.schonherz.java.training.hw7.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hu.schonherz.java.training.hw7.dto.Order;

// Mapper is needed to convert object from the data queried from the database.
public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setUser_id(rs.getInt("user_id"));
		order.setProduct_id(rs.getInt("product_id"));
		return order;
	}

}
