//Answer:1366
import java.math.BigInteger;
public class Problem016 {

	public static void main(String[] args) {
		BigInteger sum=BigInteger.ZERO;
		BigInteger num=BigInteger.TWO.pow(1000);
		while(!num.equals(BigInteger.ZERO)) {
			sum=sum.add(num.mod(BigInteger.TEN));
			num=num.divide(BigInteger.TEN);			
		}
		System.out.println(sum);
	}
}
