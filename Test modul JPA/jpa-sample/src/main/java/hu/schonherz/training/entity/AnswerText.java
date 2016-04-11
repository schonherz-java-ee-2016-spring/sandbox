package hu.schonherz.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity	
@Table(name = "AnswerText")
public class AnswerText implements Serializable {
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public AnswerText() {
		super();
	}

	private static final long serialVersionUID = 4275360311909336858L;

	@Id
	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	private Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	// LOB
	@Column(name = "text")
	private String text;

}
