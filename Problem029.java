//Answer:9183
import java.math.BigInteger;
public class Problem029 {

	public static void main(String[] args) {
		String[] array=new String[99*99];
		int counter=0;
		BigInteger a=BigInteger.TWO;
		BigInteger b=BigInteger.TWO;
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=100; j++) {
				BigInteger buffer=BigInteger.ONE;
				for(int x=0; x<j; x++) {
					buffer=buffer.multiply(a);
				}
				array[counter]=buffer+"";
				counter++;
				b=b.add(BigInteger.ONE);
			}
			a=a.add(BigInteger.ONE);
		}
		for(int i=0; i<(99*99); i++) {
			for(int j=(i+1); j<(99*99); j++) {
				if(array[i].equals(array[j])) {
					array[j]="0";
				}
			}
		}
		int ans=0;
		for(int i=0; i<(99*99); i++) {
			if(!array[i].equals("0"))
				ans++;
		}
		System.out.println(ans);
	}

}
