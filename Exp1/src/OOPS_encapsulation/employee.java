package OOPS_encapsulation;

public class employee {

	 public String name;
	 public int age;
	 private double pesa;
	 
	public double getSalary() {
		return pesa;
	}
	public double setSalary(double salary) {
		
		this.pesa=salary;
		return pesa;
	}
	
}
