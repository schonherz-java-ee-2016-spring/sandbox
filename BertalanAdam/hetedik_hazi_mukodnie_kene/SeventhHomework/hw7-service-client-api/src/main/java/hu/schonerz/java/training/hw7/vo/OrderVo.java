package hu.schonerz.java.training.hw7.vo;

import java.io.Serializable;

// Plain Value Object
public class OrderVo implements Serializable {

	private static final long serialVersionUID = -7157012296678541114L;

	Integer user_id;
	Integer product_id;

	public OrderVo() {
		super();
	}

	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the product_id
	 */
	public Integer getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id
	 *            the product_id to set
	 */
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "OrderVo [user_id=" + user_id + ", product_id=" + product_id + "]";
	}
}
