package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Entitás nélküli check it majd

@Table(name = "AnswerText")
public class AnswerText {

	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	private Answer answer;

	// LOB
	@Column(name = "text")
	private String text;

}
