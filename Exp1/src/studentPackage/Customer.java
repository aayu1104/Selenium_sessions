package studentPackage;
import java.util.Arrays;

public class Customer {
	
	public String[] getEmployeeDevice(String empName) {
		
		System.out.println("getting devices information for employee: " + empName);
		
		//with switch case

		switch (empName.toLowerCase().trim()) {
		
		case "neha":
			String devices1[]= {"macbook","iphone"};
		return devices1;
		
		case "lavish":
			String devices2[]= {"windows","iphone11"};
		return devices2;
		
		}
		
		return null;
			
	}
	
	public static void main(String[] args) {
		
		Customer obj=new Customer();
		String d[]=obj.getEmployeeDevice("nEha     ");
		System.out.println(Arrays.toString(d));
		
	}

}
