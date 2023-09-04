package ITAdminProject;

public class Employee extends PasswordGenerator {
	private String firstName;
	private String lastName;
	String Department;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public void email() {
		System.out.println("Email: " + firstName.toLowerCase() + lastName.toLowerCase() + "@" + Department + ".abc.com");
	}
}
