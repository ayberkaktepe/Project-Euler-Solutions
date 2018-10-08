//Answer:748317
public class Problem037 {

	public static void main(String[] args) {
		long i=10;
		long sum=0;
		int counter=0;
		while(counter!=11) {
			boolean rule=true;
			if(!isitPrime(i)) {
				rule=false;
			}
			long buffer=i;
			int length=(int)Math.log10(i)+1;
			for(int j=0; j<length; j++) {
				if(!isitPrime(buffer)) {
					rule=false;
				}
				buffer/=10;
			}
			
			buffer=i;
			long vector=1;
			for(int j=0; j<length; j++) {
				vector*=10;
			}
			for(long k=vector; k>1; k/=10) {
				if(!isitPrime(buffer%k)) {
					rule=false;
				}
			}
			if(rule) {
				sum+=i;
				counter++;
			}
			i++;
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
