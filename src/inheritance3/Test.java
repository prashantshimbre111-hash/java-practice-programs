package inheritance3;

public class Test {
	public static void main(String[]args) {
	school s = new school();
	System.out.println(s.pincode);
	s.name();
	
	teacher t = new teacher();
	System.out.println(t.id);
	System.out.println(t.pincode);
	t.name();
	t.getadd();
	
	school ss = new teacher();
	System.out.println(ss.pincode);
	ss.name();
	ss.getadd();
	
	

}
}
