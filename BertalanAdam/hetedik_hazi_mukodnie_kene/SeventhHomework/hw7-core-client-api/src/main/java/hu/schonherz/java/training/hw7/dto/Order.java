package hu.schonherz.java.training.hw7.dto;

import java.io.Serializable;

/**
 * Plain Data Transfer Object for carrying order data.
 * */
public class Order implements Serializable {

	private static final long serialVersionUID = -7730624538924273691L;
	
	private int user_id;
	private int product_id;

	public Order(int user_id, int product_id) {
		super();
		this.user_id = user_id;
		this.product_id = product_id;
	}

	public Order() {
		super();
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id
	 *            the product_id to set
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "Order [user_id=" + user_id + ", product_id=" + product_id + "]";
	}
}
