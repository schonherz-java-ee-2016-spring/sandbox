package hu.schonherz.training.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Option")
public class Option extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "Question_id", referencedColumnName = "id")
	private Question question;
	
	private Boolean isCorrect;
	private String optionText;

	public Option() {
		super();
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

}
