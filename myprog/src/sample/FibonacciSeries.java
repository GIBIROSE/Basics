package sample;

public class FibonacciSeries {

	public void fibonacciDisplay() {

		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fib = new FibonacciSeries();
		fib.fibonacciDisplay();
	}

}
