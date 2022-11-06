package sample;

public class ReverseNumber {

	public void reverseString() {

		int num = 1234, reversed = 0;

		System.out.println("Original Number: " + num);
		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}

		System.out.println("Reversed Number: " + reversed);

	}

	public static void main(String[] args) {
		ReverseNumber samp = new ReverseNumber();
		samp.reverseString();

	}

}
