//Answer:4613732
public class Problem002 {

	public static void main(String[] args) {
		
		long a=0, b=1, t=0;
		long sum=0;
		while(t<4000000){
			t=a+b;
			a=b;
			b=t;
			if(t%2==0){
			sum=sum+t;
			}
		}
		System.out.println(sum);

	}

}
