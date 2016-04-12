package hu.schonherz.training.vo;

import java.io.Serializable;

public class QuestionTypeVo implements Serializable {
	private static final long serialVersionUID = 1115806741186168178L;

	private Long id;
	private String name;

	public QuestionTypeVo() {
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

}
