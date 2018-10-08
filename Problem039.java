//Answer:840
public class Problem039 {

	public static void main(String[] args) {
		int maxval=0;
		int n=0;
		int arr[]=new int[1001];
		for(int a=1; a<=998; a++) {
			for(int b=a; b<=998; b++) {
				for(int c=b; c<=998; c++) {
					if(a+b+c<=1000&&(a*a)+(b*b)==(c*c)) {
						arr[(a+b+c)]+=1;
					}
				}
			}
		}
		for(int i=0; i<=1000; i++) {
			if(arr[i]>maxval) {
				maxval=arr[i];
				n=i;
			}
		}
		System.out.println(n);
	}

}
