package hu.schonherz.training.service;

import org.springframework.beans.factory.annotation.Autowired;

import hu.schonherz.training.mapper.QuestionTypeMapper;
import hu.schonherz.training.repository.QuestionTypeRepository;
import hu.schonherz.training.vo.QuestionTypeVo;

public class QuestionTypeServiceImpl implements QuestionTypeService {
	
	@Autowired
	QuestionTypeRepository questionTypeRepository;

	@Override
	public void createQuestionType(QuestionTypeVo questionTypeVo) throws Exception {
		questionTypeRepository.saveAndFlush(QuestionTypeMapper.toDto(questionTypeVo));

	}

}
