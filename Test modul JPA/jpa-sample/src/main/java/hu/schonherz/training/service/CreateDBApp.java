package hu.schonherz.training.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hu.schonherz.training.entity.Answer;
import hu.schonherz.training.entity.AnswerNote;
import hu.schonherz.training.entity.AnswerText;
import hu.schonherz.training.entity.Option;
import hu.schonherz.training.entity.Question;
import hu.schonherz.training.entity.Test;
import hu.schonherz.training.entity.User;

public class CreateDBApp {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Test test = new Test();
		test.setTitle("First Test");
		
		User user = new User();
		
		Answer answer = new Answer();
		AnswerNote answernote = new AnswerNote();
		AnswerText answertext = new AnswerText();
		Question question = new Question();
		question.setTest(test);
		question.setText(question.getTest().getTitle() + " question");
		
		Option option = new Option();
		option.setIsCorrect(true);
		option.setOptionText("asd");
		option.setQuestion(question);
		
		answer.setOption(option);
		answer.setRight(false);
		answer.setUser(user);
		
		answernote.setAnswer(answer);
		answernote.setNote("mi ez a hozzaalas?");
		
		answertext.setAnswer(answer);
		answertext.setText("MACSKAAAAAAAAAAAA");
		
		
		
		entitymanager.persist(test);
		entitymanager.persist(question);
		entitymanager.persist(option);
		entitymanager.persist(user);
		entitymanager.persist(answer);
		entitymanager.persist(answernote);
		entitymanager.persist(answertext);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}