//Answer:7652413
public class Problem041 {

	public static void main(String[] args) {
		for(int i=987654321; ; i-=2){
			if(isitPalindromic(i)&&isitPrime(i)) {
				System.out.println(i);
				break;
			}
		}
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
	static boolean isitPalindromic(int a) {
		int buff=a;
		int digits[]=new int[10];
		while(buff!=0) {
			digits[buff%10]+=1;
			buff/=10;
		}
		for(int i=1; i<=Math.log10(a)+1; i++) {
			if(digits[i]!=1)
				return false;
		}
		return true;
	}
	
}
