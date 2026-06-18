package nestedifelse;

public class licence {
	
	public static void main(String[] args) {
		
		int age  = 18;
		
		boolean pancard = true;
		
		if(age >= 18) {
			if(pancard) {
				
				System.out.println("eligible for apply learning liscence");
			}
			else {
				System.out.println("please get pancard");
			}
			
		}
		else{
			System.out.println("you are not eligible for liscence");
		}
		
	}

}
