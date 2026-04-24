package returntypeparameterizedmethod;

public class Test {
	
	public static void main(String[] args) {
		
		Add a = new Add();
		int value = a.cal(21 , 65);
		System.out.println("addition with return parameterized : " + value);
		
		Addition A = new Addition();
		int cal = A.sum(32, 43);
		System.out.println("addition of p and q by using returntype parameterized method : " + cal);
		
		
	}

}
