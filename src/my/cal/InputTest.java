package my.cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class InputTest {

	@Test
	public void testGetFirstValue() {
	}

	@Test
	public void testGetSymbol() {
	}

	@Test
	public void testGetSecondValue() {
	}

	@Test
	public void testPrint() {
		Input.print(0);
		int acutual = 0;
		assertEquals(0,acutual);
	}

	@Test
	public void testCalcul() {
		int actual = Input.calcul(20, "+", 10);
		assertEquals(30,actual);
		int actual1 = Input.calcul(20, "-", 10);
		assertEquals(10,actual1);
		int actual2 = Input.calcul(20, "*", 10);
		assertEquals(200,actual2);
		int actual3 = Input.calcul(20, "/", 10);
		assertEquals(2,actual3);
	}

}
