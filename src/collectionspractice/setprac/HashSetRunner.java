package collectionspractice.setprac;

import java.util.HashSet;

public class HashSetRunner {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("apple"); // 5
		hs.add("banana"); // 6
		hs.add("carrot"); // 6
		hs.add("dates"); // 5
		hs.add("elderberry"); // 10
		hs.add("banana"); // 6
		
		System.out.println(hs);
		
		// no idex -> no get(i) 
	}

}
