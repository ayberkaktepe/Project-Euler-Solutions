//Answer:134043
public class Problem047 {

	public static void main(String[] args) {
		for(int i=1; ; i++) {
			if(rule(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	public static boolean rule (int a) {
		int countera=0 , counterb=0 , counterc=0 , counterd=0;
		for(int i=1; i<=(a+3)/2; i++) {
			if(isitPrime(i)) {
				if(a%i==0)
					countera++;
				if((a+1)%i==0)
					counterb++;
				if((a+2)%i==0)
					counterc++;
				if((a+3)%i==0)
					counterd++;
			}
		}
		if (countera==4&&counterb==4&&counterc==4&&counterd==4)
			return true;
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
