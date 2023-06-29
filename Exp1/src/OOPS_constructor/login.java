package OOPS_constructor;

public class login {
	
		String username;
		String passward;
		
	public login (String username, String passward) {
		
		this.username=username;
		this.passward=passward;
		
		
	}
	
	public boolean doLogin() {
		System.out.println("Enter Username" + username);
		System.out.println("Enter password" + passward);
		System.out.println("Successfully loged in");
		return true;
	}
	
}

//there is no main function,made an another class named logintest.go and check


