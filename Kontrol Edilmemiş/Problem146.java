package euler;
/*
10
315410
927070
2525870
8146100
16755190
39313460
97387280
119571820
121288430
130116970
139985660
144774340
sum=821107610
 */
import java.math.BigInteger;

public class problem146v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger squared;
		long sum=0;
		BigInteger three=BigInteger.valueOf(3l);
		BigInteger seven=BigInteger.valueOf(7l);
		BigInteger nine=BigInteger.valueOf(9l);
		BigInteger thirteen=BigInteger.valueOf(13l);
		BigInteger twentyseven=BigInteger.valueOf(27l);
		for(long i=10;i<=150000000; i+=10){
			squared=BigInteger.valueOf(i*i);
			BigInteger b1=squared.add(BigInteger.ONE);
			BigInteger b2=squared.add(three);
			BigInteger b3=squared.add(seven);
			BigInteger b4=squared.add(nine);
			BigInteger b5=squared.add(thirteen);
			BigInteger b6=squared.add(twentyseven);
			if(b1.isProbablePrime(10)&&b2.isProbablePrime(10)&&b3.isProbablePrime(10)&&b4.isProbablePrime(10)&&b5.isProbablePrime(10)&&b6.isProbablePrime(10)){
				long square=i*i;
				if(isPrime(square+1)&&isPrime(square+3)&&isPrime(square+7)&&isPrime(square+9)&&isPrime(square+13)&&isPrime(square+27)){
					System.out.println(i);
					sum+=i;
				}
			}
		}
		System.out.println("sum="+sum);
	}
	static boolean isPrime(long n) {//used this method for being sure
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
