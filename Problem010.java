//Answer:142913828922
public class Problem010 {

	public static void main(String[] args) {

		long sum=2;//There is only one even prime number. So I only check for odd numbers.
		for(long i=3; i<=2000000; i+=2) {
			if(isitPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
		

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
