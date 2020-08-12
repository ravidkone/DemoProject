package TDD;

import java.util.function.Predicate;

public class phoneNumberValidator implements Predicate<String>{

	public boolean validate(String phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean test(String phoneNumber) {
		
		return phoneNumber.startsWith("+91") && phoneNumber.length()==13;
		
//		if(phoneNumber.startsWith("+91") && phoneNumber.length()==13) {
//			return true;
//		}else {
//		return false;
//		}
		
	}

}
