package hu.schonherz.training.main;

import hu.schonherz.training.service.TestService;
import hu.schonherz.training.service.TestServiceImpl;
import hu.schonherz.training.vo.TestVo;

public class MainApp {
	public static void main(String[] args) {
		
		TestService service = new TestServiceImpl();
		TestVo testVo = new TestVo();
		testVo.setName("First Test");
		try {
			service.createTest(testVo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
