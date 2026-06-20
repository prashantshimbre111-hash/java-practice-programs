package exceptionpractice;

public class arrayindex {
	
	public static void main(String[]args) {
		
	try {	int[] a = {12,23,34};
		
		System.out.println(a[5]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException found");
	}
	System.out.println("program ended");
	}

}
