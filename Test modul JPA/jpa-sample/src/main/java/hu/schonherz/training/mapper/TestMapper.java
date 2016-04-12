package hu.schonherz.training.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import hu.schonherz.training.entity.Test;
import hu.schonherz.training.vo.TestVo;

public class TestMapper {
	
	private static Mapper mapper = new DozerBeanMapper();
	
	public static TestVo toVo(Test testDto) {
		if (testDto == null) {
			return null;
		}
		return mapper.map(testDto, TestVo.class);
	}

	public static Test toDto(TestVo testVo) {
		if (testVo == null) {
			return null;
		}
		return mapper.map(testVo, Test.class);
	}

	public static List<TestVo> toVo(List<Test> testDtos) {
		List<TestVo> testVos = new ArrayList<>();
		for (Test testDto : testDtos) {
			testVos.add(toVo(testDto));
		}
		return testVos;
	}

	public static List<Test> toDto(List<TestVo> testVos) {
		List<Test> testDtos = new ArrayList<>();
		for (TestVo testVo : testVos) {
			testDtos.add(toDto(testVo));
		}
		return testDtos;
	}

}
