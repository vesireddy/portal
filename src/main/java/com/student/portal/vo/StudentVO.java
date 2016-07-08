package com.student.portal.vo;

/**
 * This acts as the VO object for the student information.
 *
 */
public class StudentVO {

	private String firstName;

	private String lastName;

	private String password;

	private String email;

	private String city;

	private String zip;

	private boolean isValidStudent = false;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidStudent() {
		return isValidStudent;
	}

	public void setValidStudent(boolean isValidStudent) {
		this.isValidStudent = isValidStudent;
	}

}
