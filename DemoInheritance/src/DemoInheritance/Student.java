package DemoInheritance;

public class Student extends Person{
	
	private String status;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		
		if(age > 24)
			this.status = "Non-traditional";
		else
			this.status = "Traditional";
	}// END OF CONSTRUCTOR
	
	public Student(Student object){
		super(object.firstName, object.lastName, object.age);
		this.status = object.status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Student: " + this.getFirstName() + " " + lastName + " (" + this.status + ")";
	}
	
//	public String fullName(){
//		return firstName + " " + lastName + " " + age;
//		return super.fullName();
//	}
	

}
