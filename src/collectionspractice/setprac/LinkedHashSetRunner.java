package collectionspractice.setprac;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetRunner {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet(); // Dulicates not allowed but insertion order is preserved
		lhs.add("tomato"); // 5
		lhs.add("apple"); // 5
		lhs.add("banana"); // 6
		lhs.add("carrot"); // 6
		lhs.add("dates"); // 5
		lhs.add("elderberry"); // 10
		lhs.add("banana"); // 6
		
		System.out.println(lhs);
		
		// no idex -> no get(i) 
	}

}
