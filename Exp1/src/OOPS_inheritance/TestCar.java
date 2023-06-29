package OOPS_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.start(); //overridden
		b.stop(); //inherited
		b.refuel(); //inherited
		b.autoparking(); //individual
		b.engine(); //accessing grand parent(vehicle) method
		
		BMW.billing(); //static function called by class name
		Car.billing(); //""
		
		System.out.println("--------------");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.autoparking(); not possible because parent can not inherit child.
		
		
		//up/Top casting
		//when a child class object referred by parent class reference variable.
		
		//Car c1 = new BMW();
		
		//down casting
		//when a parent class object referred by parent class reference variable.
		
		//BMW b1 = (BMW) new Car(); 
		//it will show class cast exception runtime error
		
	}

}
