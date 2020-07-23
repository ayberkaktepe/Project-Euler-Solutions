import java.math.BigInteger;


public class problem056 {

	/**
	 * A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large:
	 * one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.
	 * Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?
	 */
	public static void main(String[] args) {
		long maxdigitsum=0;
		for(int a=1; a<100; a++){
			for(int b=1; b<100; b++){
				
				String aa=a+"";
				BigInteger a1=new BigInteger(aa);
				BigInteger sonuc=a1.pow(b);		
				
				
				String digits = sonuc.toString();//BigInteger'ı stringe çevirip harf harf parçalayıp inte çevirip topladım. fakat integer dizisine de aktarabilirdim. mod alıp bölerek.
				int sum = 0;
				for(int i = 0; i < digits.length(); i++) {
				    int digit = (int) (digits.charAt(i) - '0');
				    sum = sum + digit;
				}
				if(sum>maxdigitsum){
					maxdigitsum=sum;
				}
				
			}
			
		}
		System.out.println(maxdigitsum);

	}

}
