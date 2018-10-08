//Answer:443839
public class Problem030 {
	public static void main(String[] args) {
		long sum=0;
		for(long a=2; a<=354294; a++){//59,049*6=354,294
			long buffer=a;
			long digitpowersum=0;
			while(buffer>0){
				digitpowersum+=((buffer%10)*(buffer%10)*(buffer%10)*(buffer%10)*(buffer%10));
				buffer/=10;
			}
			if(digitpowersum==a){
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
