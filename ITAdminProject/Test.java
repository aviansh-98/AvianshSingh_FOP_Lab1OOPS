package ITAdminProject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		CredentialService emp = new CredentialService();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String firstName = s.next();
		emp.setFirstName(firstName);
		System.out.println("Enter your Last Name");
		String lastName = s.next();
		emp.setLastName(lastName);
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technichal");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String department = null;
		int option = s.nextInt();
		switch (option) {
		case 1:
			department = "Tech";
			emp.setDepartment(department);
			break;
		case 2:
			department = "Adm";
			emp.setDepartment(department);
			break;
		case 3:
			department = "HR";
			emp.setDepartment(department);
			break;
		case 4:
			department = "Lg";
			emp.setDepartment(department);
			break;
		default:
			System.out.println("Invalid choice, please select an option from 1/2/3/4");
		}
		emp.showCredentials();
	}
}
