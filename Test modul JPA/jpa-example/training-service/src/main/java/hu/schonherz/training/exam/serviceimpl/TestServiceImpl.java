package hu.schonherz.training.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.training.exam.mapper.TestMapper;
import hu.schonherz.training.exam.repository.ExamRepository;
import hu.schonherz.training.exam.service.TestService;
import hu.schonherz.training.exam.vo.TestVo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TestServiceImpl implements TestService {

	@Autowired
	ExamRepository testRepository;

	@Override
	public void createTest(TestVo testVo) throws Exception {
		testRepository.saveAndFlush(TestMapper.toDto(testVo));
	}
}
