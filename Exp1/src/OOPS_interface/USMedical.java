package OOPS_interface;

public interface USMedical extends WHO,USHG{
	
	int min_fee=200;
	
	public void cardioservices();
	
	public void nueroServices();
	
	public void physioServices();
	
	//common
	public void emergencyServices();

	@Override
	public void covidVaccination();
	
	//After jdk1.7
	//1. can add static method with body. 
	public static  void taxCollection() {
		System.out.println("US - taxCollection");
	}
	//2. can add default method with body and can override in fortis with public keyword instead of default
	default void getMedicalServices() {
		System.out.println("US - getMedicalServices");
	}
	
}
