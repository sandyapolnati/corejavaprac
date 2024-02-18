package exceptionprac;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {

		FileReader fr = new FileReader("C:/Users/sandh/Desktop/fruits.txt");
		
//  	System.out.println((char)fr.read());
		
		
		/// BufferedReader +  FileReader -> read the file
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		String line = "";
//		for(; (line = br.readLine())!=null ;)
//		{
//			System.out.println(line);
//		}
		
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		
		}catch (Exception e) {
			System.out.println("unabel to read file....");
		}finally {
			System.out.println("finally block ");
		}

	}


}
