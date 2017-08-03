package person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Student("둘리");
		
		p.setName("둘리");
		
		// Down Casting
		// Explicity Casting
		Student s1 = (Student) p;
		s1.set();
		
		((Student) p).set();
		
		// Up Casting
		// Implicity Casting
		Person p2 = s1;
		p2.setName("마이콜");
	}
}
