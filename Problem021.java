//Answer:31626
public class Problem021 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<10000; i++) {
			if(i==method(method(i))&&method(method(i))<10000&&i!=method(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}
	static int method (int n) {
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0)
				sum+=i;
		}
		return sum;
	}

}
