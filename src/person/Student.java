package person;

public class Student extends Person {
	public Student() {
		System.out.println("Student() called");
	}
	
	public Student(String name) {
		// default 삽입되는 부모 생성자
		// super();
		super(35);
		System.out.println("Student(String) called");
	}
	
	public void set() {
		// public field
		name = "둘리";
		
		// proteted field
		height = 150;
		
		// default field
		age = 35;
		
		// private error
//		weight = 40;
	}
}
