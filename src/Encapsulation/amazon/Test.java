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
		
		
		flipkart f = new flipkart();
		
		f.setId("212332ddsd");
		String i = f.getId();
		System.out.println("id : "+ i);
		
		f.setPass("bedvhby23975");
		String pass = f.getPass();
		System.out.println("pass : " + pass);
	}

}
