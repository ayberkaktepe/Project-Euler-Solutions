//Answer:76576500
public class Problem012 {

	public static void main(String[] args) {
		int triangle=0;
		for(int j=1; ; j++) {
			triangle+=j;
			if(countdivisors(triangle)>500) {
				System.out.println(triangle);
				System.exit(0);
			}
		}
	}
	static int countdivisors(int x) {
		int counter=1;
		int end=(int)Math.sqrt(x);
		for(int i=1; i<=end; i++) {
			if(x%i==0)
				counter+=2;
		}
		return counter;
	}

}
