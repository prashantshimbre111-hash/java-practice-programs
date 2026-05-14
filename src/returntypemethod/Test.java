package returntypemethod;

public class Test {
	
	public static void main(String[] args) {
		
		Add a = new Add();
		int total = a.calculation();
		System.out.println(total);
		
		calculation c = new calculation();
		int cal = c.sum();
		System.out.println("addition of a and b of helper class in main  class by using return type method : " + cal);
		
		returnmethod r = new returnmethod();
		int total1 = r.practice();
		System.out.println(total1);

	}

}
