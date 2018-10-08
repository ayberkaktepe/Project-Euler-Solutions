//Answer:997651
import java.util.ArrayList;
public class Problem050 {

	public static void main(String[] args) {
		ArrayList <String> num = new ArrayList <String> ();
		int maxlength=0;
		int pcounter=0;
		for(int i=1; i<=999999; i++) {
			if(isitPrime(i)) {
				pcounter++;
			}
		}
		int prime[]=new int[pcounter];
		pcounter=-1;
		for(int i=2; i<=999999; i++) {
			if(isitPrime(i)) {
				pcounter++;
				prime[pcounter]=i;
			}
		}
		for(int i=0; i<=pcounter; i++) {
			for(int j=(i+1); j<=pcounter; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=prime[k];
				}
				if(sum>=999999)
					break;
				if(isitPrime(sum)&&(j-i+1)>maxlength) {
					maxlength=j-i-1;
					num.add(sum+"");
				}
			}
		}
		System.out.println(num.get(num.size()-1));
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
