package TDD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

class phoneNumberValidatorTest {
	phoneNumberValidator underTest;

	@BeforeMethod
	void setup() {
		underTest = new phoneNumberValidator();
	}
	

	@Test
	void validatePhoneNumber() {

		String phoneNumber = "+919686250595";

		boolean isValid = underTest.test(phoneNumber);

		assertEquals(isValid, true);

	}

	@Test
	void validatePhoneNumberIncoorect() {

		String phoneNumber = "919686250595";

		boolean isValid = underTest.test(phoneNumber);

		assertEquals(isValid, false);
	}

	@Test
	void validatePhoneNumberIncoorectLength() {

		String phoneNumber = "+9196862505950000";

		boolean isValid = underTest.test(phoneNumber);

		assertEquals(isValid, false);
	}

}
