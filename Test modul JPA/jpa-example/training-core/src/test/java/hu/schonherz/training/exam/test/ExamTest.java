package hu.schonherz.training.exam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hu.schonherz.training.exam.entity.Exam;
import hu.schonherz.training.exam.repository.ExamRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring-core-test.xml")
public class ExamTest {
	
	@Autowired
	ExamRepository examRepository;

	@Test
	public void test() {
		Exam exam = new Exam();
		exam.setTitle("KURVA DOGA");
//		examRepository.saveAndFlush(exam);
	}

}
