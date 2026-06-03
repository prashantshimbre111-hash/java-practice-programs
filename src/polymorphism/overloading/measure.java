package polymorphism.overloading;

public class measure {
	
	public void cal(int a , int b) {
		System.out.println(a+b);
	}
	public void cal(String name) {
		System.out.println(name);
	}
	public void cal(int c, String diary , double d , float f, char q) {
		System.out.println(c + diary + d + f + q);
	}

}
