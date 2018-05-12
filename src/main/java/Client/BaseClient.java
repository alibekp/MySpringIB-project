package Client;

import Interface.Client;
import Interface.Login;
import Interface.Password;

public abstract class BaseClient implements Client {

	private Login login;
	private Password password;

	public BaseClient() {
		System.out.println(this + " - base model constructor");
	}

	public BaseClient(Login login, Password password) {
		this();
		this.login = login;
		this.password = password;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

}
