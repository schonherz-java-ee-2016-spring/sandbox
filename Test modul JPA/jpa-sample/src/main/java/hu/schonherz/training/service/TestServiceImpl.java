package hu.schonherz.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.training.mapper.TestMapper;
import hu.schonherz.training.repository.TestRepository;
import hu.schonherz.training.vo.TestVo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	@Override
	public void createTest(TestVo testVo) throws Exception {
		testRepository.saveAndFlush(TestMapper.toDto(testVo));
	}
}
