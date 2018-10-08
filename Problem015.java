//Answer:3628800
import java.math.BigInteger;
public class Problem015 {

	public static void main(String[] args) {
		//Answer is 40!/(20!*20!)
		
		BigInteger forty=new BigInteger("40");
		BigInteger twenty=new BigInteger("20");
		System.out.println(forty.divide(twenty.multiply(twenty)));
		
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
