package ExceptionDemo1;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo1 {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("C:/Users/sandh/Desktop/movies.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			String line = "";
			while ((line = br.readLine()) != null)

			{
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("unable to readfile");

		} finally {
			System.out.println("finally block");
		}
	}
}