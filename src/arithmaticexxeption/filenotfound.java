package arithmaticexxeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class filenotfound {
	public static void main(String[] args) {
	
		try{
			FileReader file = new FileReader("abc.txt");
		}
		 catch (FileNotFoundException e) {
			 System.out.println("file not found exception found");
		 }
		
		System.out.println("prashant");
	
	}
	

}
