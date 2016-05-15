package hu.schonherz.java.training.hw5.dao.test;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.java.training.hw7.dao.ProductDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/hw5-core-test-configuration.xml")
@Transactional
@Rollback
public class InsertionTest {

	@Autowired
	ProductDao pd;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void insertOrderWithTwoParameters(){
		pd.addProduct(91, "Kakaovaj");
	}
	
	@Test(expected=DuplicateKeyException.class)
	public void insertOrderWithTwoParametersExc() throws SQLException{
		pd.addProduct(1, "Letezo");
	}

}
