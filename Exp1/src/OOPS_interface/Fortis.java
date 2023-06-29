package OOPS_interface;

public class Fortis  implements IndianMedical,UKMedical,USMedical {

	
	//Indian
	
	@Override
	public void oncologyServices() {
		
		System.out.println("fh--oncologyServices");
		
	}

	@Override
	public void gynicServices() {
		
		System.out.println("fh--gynicServices");
	}

	@Override
	public void orthoServices() {
		
		System.out.println("fh--orthoServices");
	}

	//US
	@Override
	public void cardioservices() {
		
		System.out.println("fh--cardioservices");
	}

	@Override
	public void nueroServices() {
		
		System.out.println("fh--nueroServices");
	}

	@Override
	public void physioServices() {
		
		System.out.println("fh--physioServices");
	}

	//UK
	@Override
	public void entServices() {
		
		System.out.println("fh--entServices");
	}

	@Override
	public void dentalServices() {
		
		System.out.println("fh--dentalServices");
	}

	//individual
	
	public void medicalTraining() {
		
		System.out.println("fh--medicalTraining");
	}
	
	public void medicalInsurance() {
		
		System.out.println("fh--medicalInsurance");
	}

	//common
	
	@Override
	public void emergencyServices() {
		
		System.out.println("fh--emergencyServices");
		
	}

	
	//WHO
	@Override
	public void covidVaccination() {
		
		System.out.println("fh--covidVaccination");
		
	}

	@Override
	public void pandemicPolicy() {
		
		System.out.println("fh--pandemicPolicy");
		
	}

	//USHG
	@Override
	public void childCareServices() {
		System.out.println("fh--childCareServices");
		
	}
	
	//override default interface method
	@Override 
	public void getMedicalServices() {
		System.out.println("fs - getMedicalServices");
	}
	
	
	
}












