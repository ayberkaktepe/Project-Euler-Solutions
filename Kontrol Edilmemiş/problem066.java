import java.math.BigInteger;


public class problem066 {

	/**
	 * BİREBİR MATHBLOGTAKİ C# KODUNU ÇEVİRİP YAPTIM. KENDİ KATKIM 0!
	 * the BruteForce method 
	 *x^2 – D*y^2 = 1
	 *D ≤ 1000
	  */
	public static void main(String[] args) {
		double result=0;
		BigInteger pmax=new BigInteger("0");
		
		for(double D=2; D<=1000; D++){
			int limit0=(int)Math.sqrt(D);
			BigInteger limit=BigInteger.valueOf(limit0);
			BigInteger limitstop=limit.multiply(limit);
			BigInteger D2=BigInteger.valueOf((int)D);
			if(!limitstop.equals(D2)){
				BigInteger m =new BigInteger("0");
				BigInteger d =new BigInteger("1");
				BigInteger a =limit;

				BigInteger numm1 =new BigInteger("1");
				BigInteger num =a;//num=x

				BigInteger denm1 =new BigInteger("0");;
				BigInteger den =new BigInteger("1");// den=y;
				
				while(!((num.multiply(num)).subtract((D2.multiply(den)).multiply(den)).equals(BigInteger.ONE))){//num*num - D*den*den != 1
					m=(d.multiply(a)).subtract(m);
					d=(D2.subtract(m.multiply(m))).divide(d);
					a=limit.add(m).divide(d);		
					
					BigInteger numm2=numm1;
					numm1=num;
					BigInteger denm2=denm1;
					denm1=den;
					
					num=a.multiply(numm1).add(numm2);
					den=a.multiply(denm1).add(denm2);
				}
				int res = num.compareTo(pmax);
				if (res==1) {//x büyükse değerleri belleğe al
			        pmax = num;
			        result = D;
			    }
			}
		}
		System.out.println("D="+(int)result+"minimum x için max x="+pmax);
		
	}

}
