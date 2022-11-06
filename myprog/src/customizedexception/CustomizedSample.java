package customizedexception;

public class CustomizedSample {

	public static void display() throws ExceptionLicense {
		int age = 7;
		if (age < 18) {
			throw new ExceptionLicense("Not Eligible ");
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		try {

			display();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
