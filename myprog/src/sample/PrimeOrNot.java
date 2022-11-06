package sample;

public class PrimeOrNot {

	public void checkPrime(int num) {

		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag==true)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

	public static void main(String[] args) {
		
		
		PrimeOrNot pn = new PrimeOrNot();
		pn.checkPrime(3);
	}

}
