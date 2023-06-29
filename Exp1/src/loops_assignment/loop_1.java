package loops_assignment;

public class loop_1 {

	public static void main(String[] args) {
		
		/*for(int i =1;i<10;i++) {
			System.out.println("I am a batman " + i);
		}
		*/
		/*int i=1;
		
		while(i<=10) {
			System.out.println("hello world");
			i++;
		}*/
		
		
		
		
		/*for(int i=1;i<=100;i++) {
			
			if(i%2 == 0) {
			
				System.out.println("These are even numbers " + i );
			}
			else
				System.out.println("These are odd numbers " + i );
		}*/
		
		
		
		
		
		/*int a=1000,b=500,c=300;
		
		if(a>b &&a>c ) {	
			
			System.out.println( a + " is greater ");
		}
		else if(c>b && a<c) {
				System.out.println( c+ "  is greater ");
			}
			
		else {
			System.out.println( b+ " is greater /");
		}*/
	
		
		
		
		//SCORE BOARD WITH FOR LOOP
		
		for(int i=10;i<=100;i++) {
		
			if(i==0) {
				System.out.println("golden duck");
				break;
			}
			
			else if(i==25) {
				System.out.println("Its 25");
				break;
			}
			
			else if(i==50) {
				System.out.println("Yay!! half century");
				break;
			}
			
			else if(i==100) {
				System.out.println("100!!");
				break;
			}
			
			else
				System.out.println("goog going!!" + i);
				break;
		}	
		
		
	}
}
	
	