package polymorphism.overloading1;

public class garage {
	
	public void gettool( String tool) {
		System.out.println(tool);
	}
	public void gettool(String name , int mobile) {
		System.out.println(name + mobile);
	}
	public void gettool(int a , int b) {
		System.out.println(a+b);
	}

}
