package OOPs_abstructClass;

public abstract class Page implements Web{
	
	//can not create the object of abstract class
	//but we can create constructor of abstract class
	//and it will called when we called object of child class
	
	public Page(){
		System.out.println("page ..constructor");//this default constructor is must in abstract class
	}
	
	public Page(int i){
		System.out.println("page ..constructor" + i);
	}	

	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo(){
		System.out.println("page ..logo");
	}
	
	public void pageloadingRime(){
		System.out.println("page loadingg time is 10 sec");
	}
	
	public static void pagecycle() {
		System.out.println("page cycle");
	}
	
	public void privacyPolicy() {
		System.out.println("Page privacy policy");
	}
	
}
