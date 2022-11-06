package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
//case 1 try block throw catch accepts finally executes,here finally is optional
		int a[] = new int[5];// array index out of bound exception

		try {
			a[10] = 100;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Finally block executes");
		}
	}
}