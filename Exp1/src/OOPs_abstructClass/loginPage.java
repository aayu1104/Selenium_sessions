package OOPs_abstructClass;

public class loginPage extends Page {

	public loginPage(){
		System.out.println("LP -- constructor");
	}
	
	public loginPage(int i){
		System.out.println("LP -- constructor" + i);
	}
	
	@Override
	public void title() {
		
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
		
	}
	
	public void resetpwd() {
	
		System.out.println("LP -- reset password");
	}
	
	@Override
	public void pageloadingRime(){
		System.out.println("login page loadingg time is 5 sec");
	}

	public static void pagecycle() {
		System.out.println("login page cycle");
	}

//	@Override
//	public void privacyPolicy() {
//		
//		System.out.println("login page privacy policy");
//	}
	
}
