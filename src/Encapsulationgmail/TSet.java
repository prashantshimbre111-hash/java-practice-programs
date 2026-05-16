package Encapsulationgmail;

public class TSet {public static void main(String[] args) {
	

	
	gmail g = new gmail();
	g.setUsername("prashantshimbare2107@gmail.com");
	String get = g.getUsername();
	System.out.println(get);
	
	g.setPassword("pra@123");
	String getpass = g.getPassword();
	System.out.println(getpass);
}}
