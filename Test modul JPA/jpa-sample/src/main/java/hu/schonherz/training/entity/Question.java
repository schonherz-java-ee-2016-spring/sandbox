package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn(name = "testId")
	private Test test;
	
//	@OneToOne
//	@JoinColumn(name = "typeId")
//	private Type type;

	@Column(name = "text")
	private String text;

	public Question() {
		super();
	}

	/**
	 * @return the test
	 */
	public Test getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(Test test) {
		this.test = test;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}