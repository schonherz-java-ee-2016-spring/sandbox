package hu.schonherz.java.training.hw7.dto;

import java.io.Serializable;

/**
 * Plain Data Transfer Object for carrying product data.
 * */
public class Product implements Serializable{

	private static final long serialVersionUID = 3573864687339459760L;
	
	private int id;
	private String name;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Product() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
