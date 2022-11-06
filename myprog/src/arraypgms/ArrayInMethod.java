package arraypgms;

public class ArrayInMethod {

	public void min(int arr[]) {
		System.out.println(arr[0]);

	}

	public static void main(String args[]) {
		int a[] = { 33, 3, 4, 5 };// declaring and initializing an array
		ArrayInMethod arr = new ArrayInMethod();
		arr.min(a);// passing array to method

	}
}