package DemoInheritance;

public class App {

	public static void main(String[] args) {
		
		Student st1 = new Student("John","Doe", 35);
		
		System.out.println(st1.lastName);
		System.out.println(st1.fullName());

	}

}
