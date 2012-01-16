import java.util.Random;

/** Some very useful links in Modular Exponentiation and
 * implementation of Fermat's Little Theorem:
 * http://community.topcoder.com/tc?module=Static&d1=tutorials&d2=primalityTesting
 * http://stackoverflow.com/questions/3400291/fermats-little-theorem-in-js
 * http://www.dreamincode.net/forums/topic/21049-prime-number-detection/
 * Third link above -- not sure how msg555's solution works
 */

public class PrimeFactor {
	
	public static long NUM = 600851475143L;
	public static long TESTNUM = 6857;
	//public static int ITER = 28;
	
	public static void main(String[] args) {
		boolean a = isPrime(TESTNUM);
		System.out.println(a);
		primeFactors(NUM);
	}
	
	
	public static void primeFactors(long num) {
		if (isPrime(num)) {
			System.out.println(num);
		}
		else {
			int i;
			for (i=2; i<=(int)Math.sqrt(num); i++) {
				while (num%i == 0 && isPrime(i)) {
					System.out.print(i + " ");
					num /= i;
					System.out.println(num);
				}
			}			
		}
	}
	
	/** isPrime gives a definite false if the number is composite.
	 * Based on the number of iteration specified, it returns true if num is 
	 * a prime with high probability, the accuracy of which depends on
	 * number of iterations
	 * @param num	The number being checked for primality
	 * @param iter	The number of iterations, accuracy of a "true" return value is directly proportional to this
	 * @return false 	If num is composite
	 */
//	public static boolean isPrime(long num, int iter) {
//		Random rand = new Random();
//		if (num == 1) return false;
//		
//		for (int i=0; i<iter; i++) {
//			long a = nextLong(rand, num);
//			if (Math.pow(a, num-1) % num != 1) return false; //num is definitely composite
//		}
//		return true;	//num is probably prime
//	}
	
	public static boolean isPrime(long num) {
		for (int i=2; i<=(int)Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	/** Modification of Random's nextLong() method to take
	 * a long n as parameter and work like nextInt(int n) to 
	 * give a long value between zero and n. Got it from here: http://stackoverflow.com/questions/2546078/java-random-long-number-in-0-x-n-range . 
	 * Have yet to fully understand it..
	 * @param rand	The Random object rand
	 * @param n		The long val which defines the range
	 * @return		A random long number between 0 (inclusive) and n (exclusive)
	 */
	public static long nextLong(Random rand, long n) {
		long bits, val;
		do {
			bits = (rand.nextLong() << 1) >>> 1 ;
			val = bits % n;
		} while (bits-val+(n-1) < 0L);
		return val;
	}
}
