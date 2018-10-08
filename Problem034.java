//Answer:40730
public class Problem034 {

	public static void main(String[] args) {
		
		long sum=0;
		for(long a=3; a<=9999999; a++){/*
			5*9!=181440
			6*9!=2177280
			7*9!=2540160
			*/
			long num=0;
			long digit=0;
			long buffer=a;
			while(buffer!=0){
				digit=buffer%10;
				buffer/=10;
				num+=factorial(digit);
			}
			if(num==a) {
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
	public static long factorial (long n) {	
		if(n==0)
			return 1;
		long factorial=1l;
		for(long i=1; i<=n; i++)
			factorial*=i;
		return factorial;
	}
}