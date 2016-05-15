package hu.schonherz.training.exam.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "answer_text")
public class AnswerText extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	private Answer answer;

	@Type(type = "org.hibernate.type.StringClobType")
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
