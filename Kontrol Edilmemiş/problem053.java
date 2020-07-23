import java.math.*;

public class problem053 {

	public static void main(String[] args) {
		// How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
		int sayac = 0;
		for (int n = 1; n <= 100; n++){		
			int r=0;
			while (r<=n){
				String n2 = new String();
				n2 = Integer.toString(n);
				String r2 = new String();
				r2 = Integer.toString(r);
				BigInteger C= new BigInteger("0");
				BigInteger n1= new BigInteger(n2);
				BigInteger r1= new BigInteger(r2);
				
				C=((f(n1)).divide((f(r1)).multiply(f(n1.subtract(r1)))));
				System.out.println("n="+n+"r="+r+"="+C);
				int digit = 0;
				String digits = C.toString();
				digit=digits.length();
				if(digit>=7)
				{
					sayac++;					
				}
				r++;
			}
				
		}
		System.out.println(sayac);
	}
	static BigInteger f (BigInteger n){
		int sayac2 = 0;
		BigInteger a = new BigInteger("1");
		BigInteger ram = new BigInteger("1");
		String n1 = n.toString();
		
		if(n1.equals("0"))
			n=BigInteger.ONE;
		else
		{
	    BigInteger gecici = n.add(BigInteger.ONE);
	    String gecici1=gecici.toString();
	    String a1=a.toString();
	    
		while (!a1.equals(gecici1))
			{
			ram=ram.multiply(a);
			a=a.add(BigInteger.ONE);
			a1=a.toString();
			}
		}
		return ram;
	}
}
