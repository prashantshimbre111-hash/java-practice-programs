package Encapsulation.Irise;

public class Test {
	public static void main(String[] args) {

		irise i = new irise();

		i.setUsername("Irisesoftinfo.in");
		String username = i.getUsername();
		System.out.println("username : " + username);

		i.setPassword("Irise@1994");
		String password = i.getPassword();
		System.out.println("password : " + password);

	}

}
