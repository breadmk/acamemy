package junitTest.equalTest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Ignore;
import org.junit.Test;

/* 참고1=
 * assertSame(String message,Object expected,Object actual)
 * 
 */
// jUnit4 에서 Test클래스가 TestCase를 상속받지 않아도 된다.
//public class EqualTest extends TestCase {
	public class EqualTest {
//		@Test(timeout=제한시간 ms단위) 
		@Test(timeout=10) //1000ms=1초  | 1ms=1/1000초
		public void testTimeOut() throws Exception{
			long sum=0;
			for(int i=0; i<10000; i++) {
				for(int j=0; j<10000; j++) {
					sum +=j;
				}
			}
			System.out.println("sum="+sum);
		}
	
//	jUnit4 에서 테스트메소드명은 반드시 test로 시작하지 않아도 된다.
//	import static org.hamcrest.CoreMatchers.*; 를 import해야한다.
//		@Ignore 은 테스트에서 제외해라.
		@Ignore //import.org.junit.Ignore;
		@Test
		public void tIgnore()throws Exception {
			assertTrue(false);
		}
		
		
		@Test
	public void tAssertThat() {
		Object result="test";
		assertTrue(result instanceof String); //성공 jUnit4사용
		assertThat(result, instanceOf(String.class));//성공 //HamcrestMatcher
		
//		assertThat(검사할대상데이터,조건);
//		int i=3;
//		assertThat(i,is(3));
//		assertThat(Arrays.asList("one","two","three"),hasItems("one","two"));
	}
	
		

	@Test
	public void testAssertNotNull() {
//	assertNotNull("not null이어야 해요",new Object()); //성공
//	assertNull("null이어야 해요",new Object());	
		String str1 = "null 아님";
		assertNotNull("null이 아니어야 해요",str1); //성공
	}
	
	@Test
	public void TestAssertFalse() {
//		assertFalse("fail-false가 나와야해요",false);		//success
		assertFalse("fail-false가 나와야해요",true);		//fail
	}
	
	
//	Arrays.asList() : 일반 배열을 ArrayList로 변환
//	get(),contains() 은 사용가능하지만,
//	add() 사용불가.
//	List 비교
	@Test
	public void testValueEqual2() {	
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = Arrays.asList(1,2,33);
		assertEquals("두 List의 값과 순서가 같아요",expected,actual);
	}
	
	@Test
	public void testAssertArrayEquals2() {
//		배열의 길이와 값이 동일 해야 한다
		String[] expected = new String[] {"a","b","c"};
		String[] actual = new String[] {"a","b","c"};
//		배열의 값이 동일하지 않아서 fail
//		String[] actual = new String[] {"A","b","c"};
//		배열의 길이가 동일하지 않아서 fail
//		String[] actual = new String[] {"a","b"};
		
		assertArrayEquals("failure-byte array not same",expected,actual); 
	}
	
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "abcd".getBytes();
		byte[] actual = "abcq".getBytes();
		
		assertArrayEquals("failure-byte array not same",expected,actual); //failed
	}

	//reference 비교
	@Test
	public void testRefernceEqual() {	
		String str1 = new String("문자열");
//		String str2 = new String("문자열");
		String str2 = str1;
//		System.out.println("reference 비교결과 = "+(str1==str2));//false
		assertSame("두 객체의 주소값이 동일",str1,str2);
	}
	
	//value비교
	@Test 
	public void testValueEqual() {
		String str1 = new String("이순신");
		String str2 = new String("이순신");
//		System.out.println("Value 비교결과 = "+(str1.equals(str2)));//true
		assertEquals("두 객체의 값이 동일",str1,str2);
		
	}
}
