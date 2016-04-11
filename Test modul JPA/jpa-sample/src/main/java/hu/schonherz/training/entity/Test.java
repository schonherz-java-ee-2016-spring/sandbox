package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(unique = true)
	private String title;

	public Test() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
