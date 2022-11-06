package exceptionhandling;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("going to start my pgm");

		try {
			Thread.sleep(2000);

		}

		catch (InterruptedException e) {
			e.printStackTrace();

		}

		System.out.println("finished my pgm");
	}

}
