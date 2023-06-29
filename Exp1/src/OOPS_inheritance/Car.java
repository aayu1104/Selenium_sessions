package OOPS_inheritance;

public class Car extends Vehicle {

	public void start() {
		System.out.println("car --- start");
		
	}
	public void stop() {
		System.out.println("car --- stop");
		
	}
	public void refuel() {
		System.out.println("car --- refuel");
		
	}	
	
	//method hiding
	public static void billing(){
		System.out.println("car -- billing");
		
	}
	
	public static final void display() { //preventing overriding
		System.out.println("car -- display");
		
	}
	
	public final void running() {
		System.out.println("car -- running");
		
	}
	@Override
	public void engine() {
		System.out.println("car -- engine");
	}
}
