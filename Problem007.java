//Answer:104743
public class Problem007 {

	public static void main(String[] args) {

		int counter=0;
		int num=0;
		while(counter!=10001) {
			num++;
			if(isitPrime(num)) {
				counter++;
			}
		}
		System.out.println(num);

	}
	static boolean isitPrime(long n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
}
