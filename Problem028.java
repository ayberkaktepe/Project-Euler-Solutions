//Answer:669171001
public class Problem028 {

	public static void main(String[] args) {
		long sum=1;
		long a=1;
		long v=2;
		while (a<1001*1001){
			for(int i=0; i<4; i++) {
				a+=v;
				sum+=a;
			}
			v+=2;
		}
		System.out.println(sum);
	}

}
