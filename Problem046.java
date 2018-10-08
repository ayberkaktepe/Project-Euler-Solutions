//Answer:5777
public class Problem046 {

	public static void main(String[] args) {
		for(int i=3; ;i+=2) {
			if(!isitPrime(i)&&!rule(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	public static boolean rule (int i) {
		for(int j=2; j<i; j++) {
			if(isitPrime(j)) {
				int sqrt=(int)(Math.sqrt((i-j)/2));
				if((j+(2*sqrt*sqrt))==i)
					return true;
			}
		}
		return false;
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
