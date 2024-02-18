package collectionspractice.listprac;

import java.util.ArrayList;

public class ArrayListRunner {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("apple"); // 5
		al.add("banana"); // 6
		al.add("carrot"); // 6
		al.add("dates"); // 5
		al.add("elderberry"); // 10
		
		
		System.out.println(al);
		
		
		al.add(0, "tomato");
		
		System.out.println(al);
//		System.out.println(al.get(0));
		
//		for(int i =0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		// Enhanced for loop - Java 5
		
//		for(Object obj: al)
//		{
//			System.out.println(obj);
//		}
		
		
		// Java 8 streams 
		
		// list.stream().forEach(obj -> sysout(obj));  -> lambda 
		//al.stream().forEach(obj -> System.out.println(obj));
		
		//al.stream().forEach(System.out::println);
		
	}

}
