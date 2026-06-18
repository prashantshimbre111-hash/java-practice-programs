package Encapsulation.email;

public class test {
	
	public static void main(String[] args) {
		
		gmail g = new gmail();
		
		g.setEmail("prashantshimbare333@gmail.com");
		g.setPassword("qwqqw221@,./");
		
		System.out.println(g.getEmail());
		System.out.println(g.getPassword());
	}

}
