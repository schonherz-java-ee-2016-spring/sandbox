package hu.schonherz.training.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_text")
public class AnswerText implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	private Answer answer;
	

	@Lob
	private String text;

	public AnswerText() {
		super();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}


}
