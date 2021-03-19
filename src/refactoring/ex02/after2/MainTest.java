package refactoring.ex02.after2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.JUnit4TestAdapter;
import util.StandardOutputTest;

public class MainTest extends StandardOutputTest{

	@Test
	public void testMain() {
//		assertEquals(String 메세지,expected,actual);
		//예측값
		String expected= getExpectedOutput("Max eats","Max stop","Max jumping","Max stop"); 
		//실제값
		Main.main(new String[0]);
		String actual= getActualOutput();
		
		assertEquals(expected,actual);
	}
	public static junit.framework.Test Suite(){
		return new JUnit4TestAdapter(MainTest.class);
	}

}
