package OOPS_encapsulation;

public class testSalary {

	//to use employee class in encapsulation
	
	
	public static void main(String[] args) {
		
		employee obj = new employee();
		obj.name="Emma";
		obj.age=23;
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.setSalary(22.0);
		System.out.println(obj.getSalary());
		
		//object for another class "company"
		//setting values with constructor 
		//setters are useful for update the values because constructor only set the value in beginning
		
		
		//post
		company c = new company("IBM",500,15);
		//c.setName("TCS");
		//c.setEmpCount(2000);
		//c.setShareCount(20);
		
		//get
		System.out.println(c.getName());
		System.out.println(c.getEmpCount());
		System.out.println(c.getShareCount());
		
		//put
		c.setShareCount(4800);
		
		//get
		System.out.println(c.getName());
		System.out.println(c.getEmpCount());
		System.out.println(c.getShareCount());
		
	}

}
