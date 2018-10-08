//Answer:9110846700
import java.math.BigInteger;
public class Problem048 {
	public static void main(String[] args) {
		//Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000
				BigInteger sum= new BigInteger("0");
				BigInteger num= new BigInteger("1");
				for(int i=1; i<=1000; i++){   
					sum=sum.add(num.pow(i));
					num=num.add(BigInteger.ONE);		
				}
				BigInteger mod= new BigInteger("10000000000");
				System.out.println(sum.mod(mod));
	}
}
