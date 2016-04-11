package hu.schonherz.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_note")
public class AnswerNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	private Answer answer;

	@Column(nullable = true)
	@Lob
	private String note;

	public AnswerNote() {
		super();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
