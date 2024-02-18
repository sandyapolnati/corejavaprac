package collectionspractice.listprac;

import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList();
		ll.add("apple"); // 5
		ll.add("banana"); // 6
		ll.add("carrot"); // 6
		ll.add("dates"); // 5
		ll.add("elderberry"); // 10
		
		System.out.println(ll);
		
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
//		
//		for(Object obj: ll)
//		{
//			System.out.println(obj);
//		}
		
		ll.add(3, "tomato");
		
		System.out.println(ll);
		
		
		
		
	}
}
