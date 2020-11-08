package mathproblems;

public class PrimeNumber {

	public static void main(String[] args) {
		/**
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 *Autor: ALAEDDINE Kramou
		 * date: 10/18/2020
		 *
		 */

		long sum = 0;
		for (int i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(" The Number: " + sum + " \"Is Prime\"");
	}
	// check if a number is prime
	private static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number);
		boolean isPrime = true;

		// test up to square root of the number
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}


