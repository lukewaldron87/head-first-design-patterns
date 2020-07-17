package chapter3.decorator.java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		String file = "C:\\Users\\Luke Waldron\\Downloads\\test.txt";
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
							 	new BufferedInputStream(
								new FileInputStream(file)));
			
			while((c = in.read()) >= 0){
				System.out.print((char)c);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
