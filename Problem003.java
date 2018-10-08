//Answer:6857
import java.math.BigInteger;

public class Problem003 {

	public static void main(String[] args) {

		BigInteger i=new BigInteger("600851475143");
		BigInteger j=i.sqrt();
		while(!(j.equals(BigInteger.ZERO))) {
			if(i.mod(j).equals(BigInteger.ZERO)&&isitPrime(j.intValue())) {
				System.out.println(j);
				break;
			}
			j=j.subtract(BigInteger.ONE);
		}
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
