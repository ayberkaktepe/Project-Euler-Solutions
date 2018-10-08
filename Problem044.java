//Answer:5482660
public class Problem044 {

	public static void main(String[] args) {
		int arr[]=new int[5000];
		for(int a=1; a<=5000; a++){
			int pentagonal=a*((3*a)-1)/2;
			arr[a-1]=pentagonal;
		}
		for(int b=1; b<5000; b++){
			int c=0;
			while(c<b){
				int sum=arr[b]+arr[c];
				int sub=arr[b]-arr[c];
				c++;
				if(isitPentagonal(sum)&&isitPentagonal(sub)){
					System.out.println(sub);
					break;
				}
			}
		}
	}
	public static boolean isitPentagonal (int n){
		double a= (Math.sqrt((24 * n) + 1) + 1) / 6;
		if(a%1==0.0)
			return true;
		return false;
	}

}
