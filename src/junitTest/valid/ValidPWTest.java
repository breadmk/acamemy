package junitTest.valid;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//테스트소스
//비밀번호 유효성검사기능을 테스트하기위한 Test 클래스
@RunWith(Parameterized.class)
public class ValidPWTest {
		
	private String password;
	private	boolean isValid;
	private static ValidPW validator;
	
	@BeforeClass
	public static void setUp() {
		validator = new ValidPW();
	}
	public ValidPWTest(String password, boolean isValid) {
		this.password = password;
		this.isValid = isValid;
	}
	
	@Parameters
	public static Collection passwords() {
		return Arrays.asList(
		new Object[][] {
			{"qwertasdf12",true},
			{"12345678",false},
			{"q1w2e3r4t5",true},
			{"1234",false},
			{"zxcvbnm",false}
			}
		);
	}
	@Test
	public void isValidPwWithParams() {
		assertEquals(validator.isValid(this.password),this.isValid);
	}
}
