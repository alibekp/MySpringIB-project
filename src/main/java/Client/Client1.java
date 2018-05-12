package Client;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import Interface.Login;
import Interface.Password;

public class Client1 extends BaseClient implements InitializingBean, DisposableBean {

	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private boolean isPhysicalPerson;

	public Client1() {
	}

	public Client1(Login login, Password password) {
		super(login, password);
	}

	public Client1(Login login, Password password, String firstName, String lastName, int yearOfBirth, boolean isPhysicalPerson) {
		super(login, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.isPhysicalPerson = isPhysicalPerson;
	}

	public Client1(String firstName, String lastName, int yearOfBirth, boolean isPhysicalPerson) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.isPhysicalPerson = isPhysicalPerson;
	}

	@Override
	public void addClient() {
		getLogin().setLogin();
		getPassword().setPassword();
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
		System.out.println("Year of Birth is " + yearOfBirth);
		System.out.println("Is that client if physical person? " + isPhysicalPerson);

	}

	@Override
	public void clientAdded() {
		System.out.println("New client succesfully added!");
	}

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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public boolean isPhysicalPerson() {
		return isPhysicalPerson;
	}

	public void setPhysicalPerson(boolean isPhysicalPerson) {
		this.isPhysicalPerson = isPhysicalPerson;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");

	}

}
