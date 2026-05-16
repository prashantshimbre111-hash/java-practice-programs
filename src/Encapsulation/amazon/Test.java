package Encapsulation.amazon;

public class Test {
	public static void main(String[] args) {
		
		amazon a = new amazon();
		
		a.setId("prashant@amazon");
		String id = a.getId();
		System.out.println("id : " + id);
		
		a.setPassword("pras1234");
		String password = a.getPassword();
		System.out.println("password : " + password);
	}

}
