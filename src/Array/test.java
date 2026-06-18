package Array;

public class test {
	public static void main(String [] args) {
		
		int[] h = {12,33,22,44,55,66,77,88,99,90};
		
		System.out.println(h.length);
		System.out.println(h[2]);
		System.out.println(h[6]);
		System.out.println(h.hashCode());
		
		for(int i = 0 ; i < h.length ; i++) {
			System.out.println(h[i]);
		}
		
		System.out.println("----------------------");
		
		int[] s = {};
		
		int[] a = new int[5];
		a[0] = 12;
		a[1] = 13;
		a[2] = 14;
		a[3] = 15;
		a[4] = 16;
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
	}

}
