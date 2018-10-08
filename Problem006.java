//Answer:25164150
public class Problem006 {

	public static void main(String[] args) {

		long sum=0;
		long squaresum=0;
		for(long i=1; i<=100; i++) {
			sum+=i;
			squaresum+=i*i;
			
		}
		System.out.println((sum*sum)-squaresum);
		

	}

}
