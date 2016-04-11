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
@Table(name = "AnswerNote")
public class AnswerNote implements Serializable{

	private static final long serialVersionUID = -3111379203999866096L;

	public AnswerNote() {
		super();
	}

	@Id
	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id" )
	private Answer answer; 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "note")
	@Lob
	private String note;
	
	
	
	
	
}
