package OOPS_interface;

public class TestHospital {

	public static void main(String[] args) {
	
		Fortis fh= new Fortis();
		
		fh.cardioservices();
		fh.dentalServices();
		fh.entServices();
		fh.oncologyServices();
		fh.gynicServices();
		fh.nueroServices();
		fh.physioServices();
		fh.orthoServices();
		
		//hospital class
		//fh.medicalRD();
		//fh.medicalNews();
		
		//who
		fh.covidVaccination();
		fh.pandemicPolicy();
		
		//common
		fh.emergencyServices();
		
		//individual of Fortis class
		fh.medicalInsurance();
		fh.medicalTraining();
		
		//USHG
		fh.childCareServices();
		
		System.out.println("------------------------------------------");
		
		System.out.println(Fortis.min_fee);
		//default method calling
		fh.getMedicalServices();
		//  not the right way ,System.out.println(fh.min_fee);
		//Not applicable
		//USMedical us= new USMedical();
		
		//top casting
		//child class object can be referred by parent interface reference variable
		USMedical us = new Fortis();
		us.cardioservices();
		us.nueroServices();
		us.physioServices();
		System.out.println(USMedical.min_fee);
		// not the right way,System.out.println(us.min_fee);
		USMedical.taxCollection();
		//default method calling
		us.getMedicalServices();
		
		us.emergencyServices();
		
		System.out.println("-----------------------");
		
		//only access us interference methods and common methods.
		UKMedical uk = new Fortis();
		uk.dentalServices();
		uk.entServices();
		
		uk.emergencyServices();
		
		System.out.println("-----------------------");
		
		IndianMedical in = new Fortis();
		in.gynicServices();
		in.oncologyServices();
		in.orthoServices();
		
		in.emergencyServices();
		
		
		
	}

}
