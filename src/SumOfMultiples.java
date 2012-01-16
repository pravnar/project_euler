
public class SumOfMultiples {
	
	public static void main(String[] args) {
		
		int ROOF = 1000;
		int SUM = 0;
		for(int i=0; i<ROOF; i++) {
			
			if (i%3 == 0 || i%5 == 0) {
				//System.out.println(i);
				SUM = SUM + i;
			}
		}
		System.out.println(SUM);

	}

}
