package exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a = 10;

		try {
			System.out.println(a / 0);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
