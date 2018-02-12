package task;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionListener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MODELTest {
	VIEW view =new VIEW();
	MODEL model=new MODEL();
	CONTROLLER controller=new CONTROLLER(view,model);

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddNum() {
		//fail("Not yet implemented");
		//model.addNum(2.0, 7.0);
	   // assertEquals(9.0,model.getResultValue());
	}

	@Test
	void testSubNum() {
		//fail("Not yet implemented");
	//	model.subNum(9.0,4.0);
	//	assertEquals(5.0,model.getResultValue());
	}

	@Test
	void testModNum() {
	//	fail("Not yet implemented");
		
			}

	@Test
	void testMulNum() {
		model.mulNum(2.0, 5.0);
		assertEquals(10.0,model.getResultValue());
		//fail("Not yet implemented");
	}

	@Test
	void testDivNum() {
		//fail("Not yet implemented");
		//model.divNum(9.0, 0.0);
		//assertTrue(model.flag);
	}

	@Test
	void testSqrNum() {
		//fail("Not yet implemented");
		//model.sqrNum(-7);
		//assertTrue(model.flag);
	}
	
	
	
	

}
