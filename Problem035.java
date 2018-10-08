//Answer:55
public class Problem035 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=0; i<=1000000; i++){
			if(isitCircular(i)){
				counter++;
			}
		}
		System.out.println(counter);
	}
	static boolean isitPrime(int n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    int sqrtN = (int)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
	static boolean isitCircular(int i) {
		boolean circular=false;
		if(isitPrime(i)){
			int digit=0;
			int buffer=i;
			while(buffer>0){
				digit++;
				buffer/=10;	
			}
			int digitnum[]=new int[digit];
			buffer=i;
			for(int j=(digit-1); j>=0; j--){
				digitnum[j]=buffer%10;
				buffer/=10;
			}
			boolean bool=true;
			for(int j=0; j<digit; j++){
				if(digitnum[j]==0||digitnum[j]==2||digitnum[j]==4||digitnum[j]==5||digitnum[j]==6||digitnum[j]==8){
					if(digit==1){
						return true;
					}
					return false;
				}
			}

			if(bool){
				int rotation=0;
				circular=true;
				switch (digit){
				case 1:
					rotation=digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
				case 2:
					rotation=(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
				case 3:
					rotation=(digitnum[0]*100)+(digitnum[1]*10)+digitnum[2];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*100)+(digitnum[2]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[2]*100)+(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
				case 4:
					rotation=(digitnum[0]*1000)+(digitnum[1]*100)+(digitnum[2]*10)+digitnum[3];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*1000)+(digitnum[2]*100)+(digitnum[3]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[2]*1000)+(digitnum[3]*100)+(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[3]*1000)+(digitnum[0]*100)+(digitnum[1]*10)+digitnum[2];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;

				case 5:
					rotation=(digitnum[0]*10000)+(digitnum[1]*1000)+(digitnum[2]*100)+(digitnum[3]*10)+digitnum[4];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*10000)+(digitnum[2]*1000)+(digitnum[3]*100)+(digitnum[4]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[2]*10000)+(digitnum[3]*1000)+(digitnum[4]*100)+(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[3]*10000)+(digitnum[4]*1000)+(digitnum[0]*100)+(digitnum[1]*10)+digitnum[2];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[4]*10000)+(digitnum[0]*1000)+(digitnum[1]*100)+(digitnum[2]*10)+digitnum[3];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
				case 6:
					rotation=(digitnum[0]*100000)+(digitnum[1]*10000)+(digitnum[2]*1000)+(digitnum[3]*100)+(digitnum[4]*10)+digitnum[5];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*100000)+(digitnum[2]*10000)+(digitnum[3]*1000)+(digitnum[4]*100)+(digitnum[5]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[2]*100000)+(digitnum[3]*10000)+(digitnum[4]*1000)+(digitnum[5]*100)+(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[3]*100000)+(digitnum[4]*10000)+(digitnum[5]*1000)+(digitnum[0]*100)+(digitnum[1]*10)+digitnum[2];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[4]*100000)+(digitnum[5]*10000)+(digitnum[0]*1000)+(digitnum[1]*100)+(digitnum[2]*10)+digitnum[3];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[5]*100000)+(digitnum[0]*10000)+(digitnum[1]*1000)+(digitnum[2]*100)+(digitnum[3]*10)+digitnum[4];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
				case 7:
					rotation=(digitnum[0]*1000000)+(digitnum[1]*100000)+(digitnum[2]*10000)+(digitnum[3]*1000)+(digitnum[4]*100)+(digitnum[5]*10)+digitnum[6];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[1]*1000000)+(digitnum[2]*100000)+(digitnum[3]*10000)+(digitnum[4]*1000)+(digitnum[5]*100)+(digitnum[6]*10)+digitnum[0];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[2]*1000000)+(digitnum[3]*100000)+(digitnum[4]*10000)+(digitnum[5]*1000)+(digitnum[6]*100)+(digitnum[0]*10)+digitnum[1];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[3]*1000000)+(digitnum[4]*100000)+(digitnum[5]*10000)+(digitnum[6]*1000)+(digitnum[0]*100)+(digitnum[1]*10)+digitnum[2];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[4]*1000000)+(digitnum[5]*100000)+(digitnum[6]*10000)+(digitnum[0]*1000)+(digitnum[1]*100)+(digitnum[2]*10)+digitnum[3];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[5]*1000000)+(digitnum[6]*100000)+(digitnum[0]*10000)+(digitnum[1]*1000)+(digitnum[2]*100)+(digitnum[3]*10)+digitnum[4];
					if(!isitPrime(rotation)){
						circular=false;
					}
					rotation=(digitnum[6]*1000000)+(digitnum[0]*100000)+(digitnum[1]*10000)+(digitnum[2]*1000)+(digitnum[3]*100)+(digitnum[4]*10)+digitnum[5];
					if(!isitPrime(rotation)){
						circular=false;
					}
					break;
					
				default:
					break;
				}
			}
		}
		return circular;
	}
}
