package sample;

public class SwapTwoNum {

	public static void main(String[] args) {

		int x=3;
		int y=2;  
		System.out.println("Before swapping");
		System.out.println(x);
		System.out.println(y);
		int z = x;
		x = y;
		y = z;
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
	}

}
