package sample;

public class SwapTwoNumWithoutTemp {

	public static void main(String[] args) {
	
		int x=2;
		int y=3;
		
		System.out.println("B/F x:  "+x);
		System.out.println("B/f y:  "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("A/F x:  "+x);
		System.out.println("A/f y:  "+y);
		

	}

}
