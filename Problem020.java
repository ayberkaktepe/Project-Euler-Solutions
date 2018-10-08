//Answer:648
import java.math.BigInteger;
public class Problem020 {

	public static void main(String[] args) {
		//100!=93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
		BigInteger sum=BigInteger.ZERO;
		BigInteger fac=factorial(new BigInteger("100"));
		while(!fac.equals(BigInteger.ZERO)) {
			sum=sum.add(fac.mod(BigInteger.TEN));
			fac=fac.divide(BigInteger.TEN);
		}
		System.out.println(sum);
		
	}
	static BigInteger factorial (BigInteger n){
		BigInteger i = new BigInteger("1");
		BigInteger buffer = new BigInteger("1");
		String str = n.toString();
		
		if(str.equals("0"))
			n=BigInteger.ONE;
		else{
	    BigInteger buffer1 = n.add(BigInteger.ONE);
	    String str1=buffer1.toString();
	    String a1=i.toString();
	    
		while (!a1.equals(str1))
			{
			buffer=buffer.multiply(i);
			i=i.add(BigInteger.ONE);
			a1=i.toString();
			}
		}
		return buffer;
	}

}
