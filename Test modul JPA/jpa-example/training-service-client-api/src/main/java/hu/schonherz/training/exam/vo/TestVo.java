package hu.schonherz.training.exam.vo;

import java.io.Serializable;
import java.util.Set;

public class TestVo implements Serializable {
	private static final long serialVersionUID = -3247852666302347423L;

	private Long id;
	private String name;
	private Set<QuestionVo> questionSet;

	public TestVo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<QuestionVo> getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(Set<QuestionVo> questionSet) {
		this.questionSet = questionSet;
	}

}
