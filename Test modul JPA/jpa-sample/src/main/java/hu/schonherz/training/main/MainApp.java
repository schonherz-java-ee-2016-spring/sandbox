package hu.schonherz.training.main;

import hu.schonherz.training.service.QuestionTypeService;
import hu.schonherz.training.service.QuestionTypeServiceImpl;
import hu.schonherz.training.service.TestService;
import hu.schonherz.training.service.TestServiceImpl;
import hu.schonherz.training.vo.QuestionTypeVo;
import hu.schonherz.training.vo.TestVo;

public class MainApp {
	public static void main(String[] args) throws Exception {

		TestService service = new TestServiceImpl();
		TestVo testVo = new TestVo();
		testVo.setName("First Test");

		service.createTest(testVo);

		QuestionTypeService questionTypeService = new QuestionTypeServiceImpl();
		QuestionTypeVo questionTypeVo = new QuestionTypeVo();
		questionTypeVo.setName("Single Answer");
		questionTypeService.createQuestionType(questionTypeVo);
		questionTypeVo.setName("Multiple Answer");
		questionTypeService.createQuestionType(questionTypeVo);
		questionTypeVo.setName("Text Answer");

	}
}
