package hu.schonerz.java.training.hw7.vo;

import java.io.Serializable;

// Plain Value Object
public class ProductVo implements Serializable {

	private static final long serialVersionUID = 3710399655505876237L;

	Integer id;
	String name;

	public ProductVo() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
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
		return "ProductVo [id=" + id + ", name=" + name + "]";
	}
}
