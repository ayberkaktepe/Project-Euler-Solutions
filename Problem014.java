//Answer:837799
public class Problem014 {

	public static void main(String[] args) {
		long val=0;
		long longestchain=0;
		for(long i=2; i<=1000000; i++) {
			long buffer=i;
			long counter=0;
			while(Collatz(buffer)!=1) {
				buffer=Collatz(buffer);
				counter++;
			}
			if(counter>longestchain) {
				longestchain=counter;
				val=i;
			}
		}
		System.out.println(val);
		
	}
	static long Collatz(long i) {
		if(i%2==0) {
			i=i/2;
		}
		else {
			i=3*i+1;
		}
		return i;
	}

}
