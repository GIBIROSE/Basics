package sample;

public class FactoriaOfNumber {

	public void factNum(int num) {

		int i, fact = 1;

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);

	}

	public static void main(String[] args) {
		FactoriaOfNumber fn = new FactoriaOfNumber();
		fn.factNum(10);

	}

}
