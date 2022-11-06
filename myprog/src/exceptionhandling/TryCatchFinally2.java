package exceptionhandling;

public class TryCatchFinally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case 3 try doesnt throw exception
		int a[] = new int[5];// array index out of bound exception

		try {
			a[2] = 100;
			
			

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Finally block executes");
		}

	}

}
