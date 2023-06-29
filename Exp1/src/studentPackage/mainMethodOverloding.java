package studentPackage;

public class mainMethodOverloding {
	
	

	public static void main(String[] args) {
		
		mainMethodOverloding obj =new mainMethodOverloding();
		//obj.main(0);
		//obj.main("null");
		
		mainMethodOverloding.main(1);
		mainMethodOverloding.main("op");
	}
	
	public static void main(String i) {
		
		System.out.println("main 1");
	}
	
	public static void main(int i) {
		
		System.out.println("main 2");
	}
	
	
}



