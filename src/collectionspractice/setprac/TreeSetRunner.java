package collectionspractice.setprac;

import java.util.TreeSet;

public class TreeSetRunner {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(); // Dulicates not allowed, and sorted ( default asc)
		ts.add("tomato"); // 5
		ts.add("apple"); // 5
		ts.add("banana"); // 6
		ts.add("carrot"); // 6
		ts.add("dates"); // 5
		ts.add("elderberry"); // 10
		ts.add("banana"); // 6
		ts.add("APPLE"); // 5


		System.out.println(ts);

		// no idex -> no get(i)
	}

}
