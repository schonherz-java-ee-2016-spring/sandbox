package hu.schonherz.java.training.hw7.dto;

import java.io.Serializable;

/**
 * Plain Data Transfer Object for carrying user data.
 * */
public class User implements Serializable {

	private static final long serialVersionUID = -1082628511680781467L;
	
	private String name;
	private String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public User() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
