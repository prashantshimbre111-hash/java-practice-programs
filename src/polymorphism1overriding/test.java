package polymorphism1overriding;

public class test {
	
	public static void main(String[] args) {
		
		school s;
		
		s = new student();
		s.getname();
		
		s = new teacher();
		s.getname();
	}

}
