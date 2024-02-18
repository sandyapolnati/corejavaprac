package arrayprac;

public class ArraysDemo {

	public static void main(String args[]) {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 + (i * 3);
		}
		System.out.println("current array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int arr1[] = new int[11];
		arr1[0] = 20;
		for (int i = 1; i < arr1.length; i++) {
			arr1[i] = arr[i - 1];
		}
		System.out.println("current array is");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
