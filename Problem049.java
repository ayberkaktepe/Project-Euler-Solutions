//Answer:296962999629
public class Problem049 {
	public static void main(String[] args) {
		int counter=0;
		for(int i=1017; i<=9999; i++) {
			for(int j=1; i+j+j<=9999; j++) {
				int a=(i);
				int b=(i+j);
				int c=(i+j+j);
				
				if(rule(a,b,c)&&isitPrime(i)&&isitPrime(i+j)&&isitPrime(i+j+j)) {
					counter++;
					if(counter==2) {
						System.out.println(i+""+(i+j)+""+(i+j+j));
						System.exit(0);
					}
				}
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
	
	static boolean rule(int a, int b, int c) {
		int digita[]=new int[10];
		int digitb[]=new int[10];
		int digitc[]=new int[10];
		for(int k=0; k<4; k++) {
			digita[a%10]+=1;
			a/=10;
			digitb[b%10]+=1;
			b/=10;
			digitc[c%10]+=1;
			c/=10;
		}
		for(int k=0; k<10; k++) {
			if(!(digita[k]==digitb[k]&&digita[k]==digitc[k])) 
				return false;
		}
		return true;
	}
}
