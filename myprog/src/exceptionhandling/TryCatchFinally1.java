package exceptionhandling;

public class TryCatchFinally1 {

	public static void main(String[] args) {
		
		
	//case 2 try block throw catch doesn't handles finally executes
		int a[] = new int[5];// array index out of bound exception

		try {
			a[10] = 100;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Finally block executes");
		}
	}

}
