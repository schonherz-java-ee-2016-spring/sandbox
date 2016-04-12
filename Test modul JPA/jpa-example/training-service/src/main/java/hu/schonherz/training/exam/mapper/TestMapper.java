package hu.schonherz.training.exam.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import hu.schonherz.training.exam.entity.Exam;
import hu.schonherz.training.exam.vo.TestVo;

public class TestMapper {
	
	private static Mapper mapper = new DozerBeanMapper();
	
	public static TestVo toVo(Exam testDto) {
		if (testDto == null) {
			return null;
		}
		return mapper.map(testDto, TestVo.class);
	}

	public static Exam toDto(TestVo testVo) {
		if (testVo == null) {
			return null;
		}
		return mapper.map(testVo, Exam.class);
	}

	public static List<TestVo> toVo(List<Exam> testDtos) {
		List<TestVo> testVos = new ArrayList<>();
		for (Exam testDto : testDtos) {
			testVos.add(toVo(testDto));
		}
		return testVos;
	}

	public static List<Exam> toDto(List<TestVo> testVos) {
		List<Exam> testDtos = new ArrayList<>();
		for (TestVo testVo : testVos) {
			testDtos.add(toDto(testVo));
		}
		return testDtos;
	}

}
