//Answer:4782
import java.math.BigInteger;
public class Problem025 {

	public static void main(String[] args) {
		int nth=1;
		BigInteger i=BigInteger.ZERO;
		BigInteger j=BigInteger.ONE;
		BigInteger k=BigInteger.ZERO;
		while(true) {
			k=i.add(j);
			i=j;
			j=k;
			nth++;
			if((j.compareTo((BigInteger.TEN).pow(999)))==1) {
				System.out.println(nth);
				System.exit(0);
			}
		}
	}

}
