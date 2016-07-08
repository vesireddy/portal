package com.student.portal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDAO {
	
	
	public TestDAO() {
		
		Connection connection;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "dileep");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//connection.prepareStatement(String sql);
		
		
	}

}
