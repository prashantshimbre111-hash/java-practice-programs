package Twoclassvariable;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.id = 1001;
		s.name = "prashant";
		s.city = "pune";
		
		System.out.println("student id : " + s.id);
		System.out.println("student name : " + s.name);
		System.out.println("student city : " + s.city);
		
		Student s1 = new Student();
		s1.id = 1002;
		s1.name = "rohan";
		s1.city = "sambhajinagar";
		
		System.out.println("");
		System.out.println("student id : " + s1.id);
		System.out.println("student name : " + s1.name);
		System.out.println("student city : " + s1.city);
		
		Student s2 = new Student();
		s2.id = 1003;
		s2.name = "nandkishor";
		s2.city = "buldhana";
		
		System.out.println();
		System.out.println("student id : " + s2.id);
		System.out.println("student name : " + s2.name );
		System.out.println("student city : " + s2.city);
		
	}

}
