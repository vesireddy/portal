package com.student.portal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.portal.vo.StudentVO;

public class StudentRegistrationDAO {

	/**
	 * Static method to return the connection object to mysql database.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "dileep");
		return connection;
	}

	/**
	 * This method is to register student in to mysql - student table
	 * 
	 * @param studentVO
	 * @throws Exception
	 */
	public void registerStudent(StudentVO studentVO) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = getConnection();
			String sql = "insert into student_details values (?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, null);
			statement.setString(2, studentVO.getFirstName());
			statement.setString(3, studentVO.getLastName());
			statement.setString(4, studentVO.getEmail());
			statement.setString(5, studentVO.getPassword());
			statement.setString(6, studentVO.getCity());
			statement.setString(7, studentVO.getZip());
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != statement) {
				statement.close();
			}
			if (null != connection) {
				connection.close();
			}
		}
	}

	/**
	 * This method is to verify student if user entered the valid student
	 * details or not and also to return the student details if the email
	 * matches.
	 * 
	 * @throws Exception
	 */
	public StudentVO validateStudent(String email, String password) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;

		StudentVO studentVO = new StudentVO();
		try {
			connection = getConnection();
			String sql = "select * from student_details where email = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet rs = statement.executeQuery();
			String emailFromDB = null;
			String passwordFromDB = null;

			while (rs.next()) {
				emailFromDB = rs.getString(4);
				passwordFromDB = rs.getString(5);

				studentVO.setFirstName(rs.getString(2));
				studentVO.setLastName(rs.getString(3));
				studentVO.setEmail(rs.getString(4));
				studentVO.setPassword(rs.getString(5));
				studentVO.setCity(rs.getString(6));
				studentVO.setZip(rs.getString(7));

			}
			if (email.equalsIgnoreCase(emailFromDB) && password.equalsIgnoreCase(passwordFromDB)) {
				studentVO.setValidStudent(true);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != statement) {
				statement.close();
			}
			if (null != connection) {
				connection.close();
			}
		}
		return studentVO;
	}
}
