package OOPS_constructor;

public class employee {
	
	
	
	int age;
	String name;
	
	public employee() {
		
		System.out.println("default cons");
	}
	public employee(int a) {
		
		System.out.println("1 parameter cons");
	}
	
	public employee(int age,String name) {
		
		//this.age=age;
		//this.name=name;
		
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		//employee obj =new employee();
		//employee obj1 =new employee(10);
		employee obj2 = new employee(23,"anna");
		System.out.println(obj2.age);
		System.out.println(obj2.name);
	}

}
