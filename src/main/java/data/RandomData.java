package data;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomData {
	
	String confirmPassword;
	String password;
	String loginName;
	String txtEmailOTP;
	String email;
	String mobileNumber;
	String consumerNumber;
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public String getPassword() {
		return password;
	}
	public String getLoginName() {
		return loginName;
	}
	public String getTxtEmailOTP() {
		return txtEmailOTP;
	}
	public String getEmail() {
		return email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getConsumerNumber() {
		return consumerNumber;
	}
	
	public RandomData() {
		mobileNumber = RandomStringUtils.randomNumeric(10);
		password = RandomStringUtils.randomAlphanumeric(8);
		loginName = RandomStringUtils.randomAlphanumeric(8);
		txtEmailOTP = RandomStringUtils.randomNumeric(6);
		email = RandomStringUtils.randomAlphabetic(8) + "@gmail.com";
		consumerNumber = RandomStringUtils.randomNumeric(12);
    }
	
}
