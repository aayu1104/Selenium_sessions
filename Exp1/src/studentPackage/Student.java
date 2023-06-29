package studentPackage;

public class Student {
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("Marks of " + studentName);
		 //trim to remove extra space
		//toLowerCase to convert whole string in lower case
		switch(studentName.toLowerCase().trim()) {
		
		case "neha":
			return 100;
			
		
		case "aayu":
			return 90;
		
		
		case "lavish":
			return 80;
		
		}
		System.out.println("don't exist");
		return -1;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student st= new Student();
		int i=st.getStudentMarks("Lavish  ");
		
		System.out.println(i);
	}

}
