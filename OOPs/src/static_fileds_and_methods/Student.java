package static_fileds_and_methods;

public class Student {
	private String name;
	private String address;
	private int studentID;

	public static int id  = 1000; 
	
	public void setStudentID() {
		studentID = id;
		id++; 
	}
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStudentID() {
		return studentID;
	}

	
	
}
