package euler;


public class problem071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numeratorram=0;
		long denumeratorram=1;//0/0 tanýmsýz olduðundan paydayý 0 dan farklý verdim. ne verdiðim aslen önemsiz.
		for(long denumerator=2; denumerator<=1000000; denumerator++){
			//System.out.println(denumerator);
			for(long numerator=1; numerator<denumerator; numerator++){
				if(3*denumerator>7*numerator&&numeratorram*denumerator<numerator*denumeratorram&&GCD(numerator,denumerator)==1){
					numeratorram=numerator;
					denumeratorram=denumerator;
					System.out.println(numeratorram+"/"+denumeratorram);
				}
				
			}
		}
		System.out.println("cevap="+numeratorram);

		
		
		
	}
	public static long GCD (long x, long y){
		return (y==0) ? x : GCD(y, x%y);
	}

}
