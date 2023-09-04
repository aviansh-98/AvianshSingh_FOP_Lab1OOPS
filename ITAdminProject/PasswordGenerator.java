package ITAdminProject;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 8;
		String password = getpassword(length);
		System.out.println(password);

	}

	public static String getpassword(int length) {
		// TODO Auto-generated method stub
		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_char = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String value = Capital_char + small_char + numbers + symbols;
		Random r = new Random();
		char[] password = new char[length];
		for(int i = 0; i < length;i++) {
			password[i] = value.charAt(r.nextInt(value.length()));
		}
		return String.valueOf(password);
	}

}
