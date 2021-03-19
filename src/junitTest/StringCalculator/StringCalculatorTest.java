package junitTest.StringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCalculatorTest {
	static StringCalculator calc = null;
//	Test 클래스실행시 가장 처음 딱 한번 호출
//	=>공통적으로 사용이 되는 코드는 @BeforeClass 를 이용하면 된다
	
//	@Test 메소드는 매번 Test클래스의 객체를 생성한다.
	@BeforeClass
	public static void SetUp() {
		System.out.println("@BeforeClass");
		calc= new StringCalculator();
	}
//	add()메소드를 테스트하는 test메소드
//	public int add(int x, int y) {
//		return x+y;
//	}
	@Test
	public void testAdd() {
		System.out.println("@Test-testAdd()");
//		StringCalculator calc = new StringCalculator();
//		calc.add(10, 90); //예상값 100.
//		int expected = 100;
//		int actual = 100;
//		assertEquals("예상값은 100",expected,actual);
//		assertEquals("예상값은 100",100,calc.add(10, 90)); //성공
//		assertEquals("예상값은 100",10,calc.add(10, 90)); //실패
		
		int actual = calc.add(10, 90);
		assertEquals(100,actual);	//성공
	}

	@Test
	public void testMinus() {
		System.out.println("@Test-testMinus()");
//		StringCalculator calc = new StringCalculator();
//		calc.add(90, 10);
		int actual = 80;
		assertEquals("예상값은 100",100,calc.add(90,10));
	}
}
