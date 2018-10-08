//Answer:31875000
public class Problem009 {

	public static void main(String[] args) {
		
		for(int i=1; i<=997; i++) {
			for(int j=1;j<=997; j++) {
				if(i+j>=1000)
					break;
				int k=1000-(i+j);
				if(i*i+j*j==k*k&&i!=j&&i!=k&&j!=k) {
					System.out.println(i*j*k);
					System.exit(0);
				}
			}
		}
		
		

	}

}
