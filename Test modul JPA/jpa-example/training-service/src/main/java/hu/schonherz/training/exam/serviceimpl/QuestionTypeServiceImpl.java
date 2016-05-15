package hu.schonherz.training.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import hu.schonherz.training.exam.mapper.QuestionTypeMapper;
import hu.schonherz.training.exam.repository.QuestionTypeRepository;
import hu.schonherz.training.exam.service.QuestionTypeService;
import hu.schonherz.training.exam.vo.QuestionTypeVo;

public class QuestionTypeServiceImpl implements QuestionTypeService {
	
	@Autowired
	QuestionTypeRepository questionTypeRepository;

	@Override
	public void createQuestionType(QuestionTypeVo questionTypeVo) throws Exception {
		questionTypeRepository.saveAndFlush(QuestionTypeMapper.toDto(questionTypeVo));

	}

}
