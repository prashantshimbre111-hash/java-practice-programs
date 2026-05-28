package inheritance1;

public class Test  {
	
	public static void main(String [] args) {
		
		
	
		
		System.out.println("student s = new student();");
		student s = new student();
		s.getname();
		s.getname();
		System.out.println(s.id);
		System.out.println(s.name);
		
		System.out.println("teacher t = new teacher();");
		teacher t = new teacher();
		t.getname();
		System.out.println("name");
		
		System.out.println("teacher t = new student();");
		
		teacher tt = new student();
		System.out.println(tt.name);
		tt.getname();
		tt.getname();
		
		
		
		
		
	
	}
}
 