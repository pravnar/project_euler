
public class Fibonacci {
	
	public static long ROOF = 4000000;
	public static long sum = 0;
	
	public static void main(String[] args) {
		
		int i= 0;
		while (FibSequence(i)<ROOF) {
			if (FibSequence(i)%2==0) sum+= FibSequence(i);
			i++;
		}
		System.out.println(sum);
	}
	
	public static long FibSequence(long num) {
		
		long a= 1;
		long b= 2;
		long t;	
		
		if (num == 0 || num == 1) return num;
		if (num == 2 || num == 3) return num-1;
		
		for (int i=4; i<num; i++) {
			t= a;
			a= b;
			b+= t;
		}
		return a+b;
	}

}
