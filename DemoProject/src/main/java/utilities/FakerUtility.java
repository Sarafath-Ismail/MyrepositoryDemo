package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	
	Faker faker=new Faker();
	
	public String CreateRandomFirstName() {
		
		return faker.name().firstName();
		
	}
	public String CreateRandomLastName() {
		
		return faker.name().lastName();
		
	}
	public String GenerateAddress() {
		
		return faker.address().fullAddress();
		
	}
	public String GenerateEmail() {
		
		return faker.internet().emailAddress();
	}
	public String GenerateUserName() {
		
		return faker.name().username();
	}
	public String GeneratePassword() {
		
		return faker.internet().password();
	}
	
}	
