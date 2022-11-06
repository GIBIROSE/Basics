package sample;

public class ReverseString {

	public void reverseString() {

		String str = "Gibi";
		String newstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			newstr = ch + newstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + newstr);
	}

	public static void main(String[] args) {

		ReverseString rev = new ReverseString();
		rev.reverseString();

	}

}
