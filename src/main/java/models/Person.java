package models;

public class Person {

	public String firstname, lastname, email, password, confirmPassword;

	public Person(String firstname, String lastname, String email, String password, String confirmPassword) {
	 
		this.firstname = firstname;
		this.lastname = lastname ;
		this.email = email;
		this.password = password; 
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}
	
}
