package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Entitás nélküli check it majd
@Table(name = "AnswerNote")
public class AnswerNote{

	@OneToOne
	@JoinColumn(name = "answer_id", referencedColumnName = "id" )
	private Answer answer; 
	
	@Column(name = "note")
	@Lob
	private String note;
	
	
	
	
	
}
