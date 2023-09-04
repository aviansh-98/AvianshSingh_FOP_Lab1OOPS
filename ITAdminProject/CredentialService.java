package ITAdminProject;

import java.util.Random;

public class CredentialService extends Employee {
	// TODO Auto-generated method stub
	String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small_char = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String symbols = "!@#$%^&*_=+-/.?<>)";
	
	public void generateEmail() {
		System.out.println("Email: " + getFirstName().toLowerCase() + getLastName().toLowerCase() + "@" + getDepartment() + ".abc.com");
	}
	
	public String getpassword() {
		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_char = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String value = Capital_char + small_char + numbers + symbols;
		Random r = new Random();
		char[] password = new char[8];
		for(int i = 0; i < password.length;i++) {
			password[i] = value.charAt(r.nextInt(value.length()));
		}
		return String.valueOf(password);
		
	}
	
	public void showCredentials() {
		System.out.println("Dear " + getFirstName() + " your generated credentials are as follows: " );
		System.out.print("Email:");
		generateEmail();
		System.out.println("Password: " + getpassword());
	}

}
