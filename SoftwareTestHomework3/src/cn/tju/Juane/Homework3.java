package cn.tju.Juane;

public class Homework3 {
	/**
	 * Finds and prints n prime integers
	 * Jeff Offutt, Spring 2003
	 */


	public static void printPrimes(int n) {
		//int curPrime; //Value currently considered for primeness
		//int numPrimes; // Number of primes found so far;
		boolean isPrime; //Is curPrime prime?
		int MAXPRIMES = 100;
		int[] primes = new int[MAXPRIMES];// The list of primes.
		
		// Initialize 2 into the list of primes.
		primes[0] = 2;
		int numPrimes = 1;
		int curPrime = 2;
		while(numPrimes < n) {
			curPrime++; // next number to consider...
			isPrime = true;
			for(int i = 0; i <= numPrimes; i++ ) {
				//for each previous prime.
				if(isDvisible(primes[i],curPrime)) {
					//Found a divisor, curPrime is not prime.
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				// save it!
				primes[numPrimes] = curPrime;
				numPrimes++;
			
			}
		}// End while
		
		// print all the primes out
		for(int i = 0; i < numPrimes; i++) {
			System.out.println("Prime: " + primes[i] );

		}
		
	}// End printPrimes.

	private static boolean isDvisible(int prime, int curPrime) {
		boolean answer = false;
		int tmp =1;
		if(prime != 0) {
			tmp = curPrime % prime;
		}
		if( tmp == 0) {
			answer = true;
		}
		return answer;
	}

}
