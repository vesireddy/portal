package com.student.portal.action;

import org.apache.struts.action.ActionForm;

/**
 * This class acts as the form bean class for registration flow.
 *
 */
public class RegisterActionForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private String password;

	private String email;

	private String city;

	private String zip;

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

}
