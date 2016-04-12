package hu.schonherz.training.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import hu.schonherz.training.entity.QuestionType;
import hu.schonherz.training.vo.QuestionTypeVo;

public class QuestionTypeMapper {
	
	private static Mapper mapper = new DozerBeanMapper();
	
	public static QuestionTypeVo toVo(QuestionType questionTypeDto) {
		if (questionTypeDto == null) {
			return null;
		}
		return mapper.map(questionTypeDto, QuestionTypeVo.class);
	}

	public static QuestionType toDto(QuestionTypeVo questionTypeVo) {
		if (questionTypeVo == null) {
			return null;
		}
		return mapper.map(questionTypeVo, QuestionType.class);
	}

	public static List<QuestionTypeVo> toVo(List<QuestionType> questionTypeDtos) {
		List<QuestionTypeVo>  questionTypeVos = new ArrayList<>();
		for (QuestionType questionTypeDto : questionTypeDtos) {
			 questionTypeVos.add(toVo(questionTypeDto));
		}
		return  questionTypeVos;
	}

	public static List<QuestionType> toDto(List<QuestionTypeVo> questionTypeVos) {
		List<QuestionType> questionTypeDtos = new ArrayList<>();
		for (QuestionTypeVo questionTypeVo : questionTypeVos) {
			questionTypeDtos.add(toDto(questionTypeVo));
		}
		return questionTypeDtos;
	}

}
