package com.agilent.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.agilent.model.User;

@Repository("userDao")
public class UserDao {

	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
		
	public User getUser(long id) {
		
		return jdbcTemplate.queryForObject("select * from users where id=?", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet arg0, int arg1) throws SQLException {
			
				User user =  new User(arg0.getLong("id"),arg0.getString("name"),arg0.getString("email"));
				System.out.println("Returning :"+user);
				
				return user;
			}
			
		}, id);		
	}
}
