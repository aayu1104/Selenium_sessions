package OOPS_encapsulation;

public class company {

	private String name;
	private int empCount;
	private int shareCount;
	
	
	//to avoid so many setters use constructor
	
	public company(String name,int empCount,int shareCount){
		
		this.name=name;
		this.empCount=empCount;
		this.shareCount=shareCount;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public int getShareCount() {
		return shareCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	
	
	
}


