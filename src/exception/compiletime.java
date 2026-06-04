package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class compiletime {
	
	public static void main(String[] args) {
		
	try {	FileReader f = new FileReader("abc.text");
	}
	catch(FileNotFoundException e) {
		System.out.println("file not found");
		
	}
	
	
	
	}

}
