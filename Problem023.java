//Answer:4179871
public class Problem023 {

	public static void main(String[] args) {
		int[]abundant=new int[28124];
		int[]sumabundant=new int[28124];
		for(int i=1; i<=28123; i++) {
			if(isitAbundant(i))
				abundant[i]=i;
		}
		for(int i=1; i<=28123; i++) {
			for(int j=1; j<=28123; j++) {
				if(abundant[i]!=0&&abundant[j]!=0&&abundant[i]+abundant[j]<=28123) {
					sumabundant[abundant[i]+abundant[j]]=1;
				}
			}
		}
		int sum=0;
		for(int i=1; i<=28123; i++) {
			if(sumabundant[i]==0)
				sum+=i;
		}
		System.out.println(sum);
	}

	public static boolean isitAbundant(int a) {
		int sum=0;
		for(int i=1; i<=a/2; i++) {
			if(a%i==0)
				sum+=i;
		}
		if(sum>a)
			return true;
		else
			return false;
	}

}
