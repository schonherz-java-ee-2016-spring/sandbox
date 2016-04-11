package hu.schonherz.java.training.hw7.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hu.schonherz.java.training.hw7.dto.User;

//Mapper is needed to convert object from the data queried from the database.
public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		return user;
	}

}
