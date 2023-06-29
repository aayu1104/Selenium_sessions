package OOPS_encapsulation;

public class Application {

	public void m1(){
		
		//calling static function from non static function
		//no need to create object
		t1();
		System.out.println("method m1");
		m2();
	}	
	
	public void m2(){
		
		System.out.println("method m2");
		m3();
	}

	public void m3(){
		
		System.out.println("method m3");
	}
	
	
	public static void t1() {
		//calling non static function from static function
		//need to create object
		
		Application a1 = new Application();
		a1.m1();
		t2();
		System.out.println("method t1");
	}
	
	public static void t2() {
	
		System.out.println("method t2");
		t3();
	}
	
	public static void t3() {
		System.out.println("method t3");
	}
	
	public static void main(String[] args) {
		
		//Application app= new Application();
		//app.m1();
		t1();
	}

}
