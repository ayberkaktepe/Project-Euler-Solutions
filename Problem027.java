//Answer:-59231
public class Problem027 {

	public static void main(String[] args) {
		int product=0;
		int countermax=0;
		for(int a=-1000; a<=1000; a++) {
			for(int b=-1000; b<=1000; b++) {
				int counter=0;
				for(int n=0; ; n++) {
					if(!isitPrime(n*n+n*b+a))	break;
					counter++;
				}
				if(counter>countermax) {
					countermax=counter;
					product=a*b;
				}
			}
		}
		System.out.println(product);

	}
	static boolean isitPrime(int n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    int sqrtN = (int)Math.sqrt(n)+1;
	    for(int i = 6; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}

}
