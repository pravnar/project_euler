
public class LargestPalindrome {
	public static int DEGREE = 3;
	public static long TESTNUM = 51111111111115L;
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(TESTNUM));
		largestPalindrome(DEGREE);
	}
	
	public static long largestPalindrome(int deg) {
		long palin = (long)Math.pow(10, deg-1);
		for (int i= (int)Math.pow(10, deg) - 1; i>= (int)Math.pow(10, deg-1); i--) {
			for (int j= (int)Math.pow(10, deg) - 1; j>= (int)Math.pow(10, deg-1); j--) {
				if (isPalindrome((long)i*j)) {
					if (i*j > palin) {
						palin = i*j;
					}
				}
			}
		}
		System.out.println(palin);
		return palin;
	}
	
	public static boolean isPalindrome(long num) {
		int digits = 0;
		long tmp = num;
		do {
			digits++;
			tmp /= 10;
		} while (tmp >= 1);
		int[] digarray = new int[digits];
		for (int i=0; i<digits; i++) {
			digarray[digits-i-1]= (int)(num%10);
			num /= 10;
		}
		for (int i=0; i<digits/2; i++) {
			if (digarray[i] != digarray[digits-i-1]) return false;
		}
		return true;
	}

}
