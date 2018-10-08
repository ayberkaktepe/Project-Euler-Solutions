//Answer:45228
public class Problem032 {

	public static void main(String[] args) {
		
		double[] products=new double [100001];
		double maxproduct=0;
		for(long i=1; i<=9999; i++) {
									//1*9999=9999 
			for(long j=1; ; j++) {
				long k=i*j;
				if(((int)Math.log10(i)+1)+(int)(Math.log10(j))+1+(int)(Math.log10(k))+1>9){
					break;
				}
				long buffi=(long)i;
				long buffj=(long)j;
				long buffk=(long)k;
				long[] digits=new long[10];
				while(buffi!=0) {
					digits[(int)buffi%10]+=1;
					buffi/=10;
				}
				while(buffj!=0) {
					digits[(int)buffj%10]+=1;
					buffj/=10;
				}
				while(buffk!=0) {
					digits[(int)buffk%10]+=1;
					buffk/=10;
				}
				if(digits[0]==0&&digits[1]==1&&digits[2]==1&&digits[3]==1&&digits[4]==1&&digits[5]==1&&digits[6]==1&&digits[7]==1&&digits[8]==1&&digits[9]==1) {
					System.out.println("i="+i+" j="+j+" k="+k);
					products[(int)(k)]+=1;
					if(k>maxproduct) {
						maxproduct=k;
					}
				}

			}
		}
		long sum=0;
		for(long i=0; i<=maxproduct; i++) {
			if(products[(int)i]!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
