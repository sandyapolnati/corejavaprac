package arrayprac;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //int arr[] = new int arr[4];
		
		//System.out.println(al.capa());
		for(int i = 0; i<10;i++)
		{
			//arr[i] = 10 + (i*3);
			al.add(10 + (i*3));
			
		}
		System.out.println("Array List is ... ");
		for(int i = 0; i<al.size();i++)
		{
			System.out.print(al.get(i) + " ");
			
		}
		
		al.add(0, 20);
		
		System.out.println("Modified Array List is ... ");
		for(int i = 0; i<al.size();i++)
		{
			System.out.print(al.get(i) + " ");
			
		}
		
	}
}
