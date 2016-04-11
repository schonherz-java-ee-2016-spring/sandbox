package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
public class Answer extends BaseEntity {

	private static final long serialVersionUID = -123410044113143399L;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@OneToOne
	@JoinColumn(name = "option_id", referencedColumnName = "id")
	private Option option;

	@Column(name = "is_right")
	private boolean isRight;

	public Answer() {
		super();
	}

	public boolean isRight() {
		return isRight;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

}
