package OOPS_inheritance;

public class BMW extends Car {
	
	@Override
	public void start() {
		System.out.println("bmw --start");
	}

	public void autoparking() {
		System.out.println("bmw --autoparking");
	}

	public static void billing(){
		System.out.println("bmw -- billing");
		
	}
	@Override
	public void engine() {
		System.out.println("bmw -- engine");
	}
	
}
