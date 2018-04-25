package Projecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class News {

	//String Header;
	
	
	public static void ReadNews() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("X:\\WorkPlace\\Java\\NewsText\\News.txt"));		
		
		String sCurrentLine;
		
		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
		br.close();
	}
}
