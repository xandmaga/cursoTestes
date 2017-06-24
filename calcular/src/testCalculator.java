import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCalculator {

	private static calculator calc = new calculator();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc.switchOn();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calc.switchOff();
	}

	@Before
	public void setUp() throws Exception {
		calc.clear();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	  public void add() {
	    calc.add(1); 
	    calc.add(1); 
	    assertEquals(calc.getResult(), 2); 
	  }
	
	  @Test
	  public void subtract() {
	    calc.add(10); 
	    calc.subtract(2); 
	    assertEquals(calc.getResult(), 8); 
	  }

	  @Test
	  public void divide() {
	    calc.add(8); 
	    calc.divide(2); 
	    assertTrue(calc.getResult() == 4); 
	  }

	  @Test(expected = ArithmeticException.class)
	  public void divideByZero() {
	    calc.divide(0); 
	  }

	

}