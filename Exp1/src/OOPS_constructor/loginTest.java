package OOPS_constructor;

public class loginTest {

	public static void main(String[] args) {
		
		login u1= new login("aayu@gmail.com","aayu123");
		
		if(u1.doLogin()){
			System.out.println("show next page");
		}

		
	}

}
