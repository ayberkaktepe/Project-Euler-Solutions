//Answer:142857
public class Problem052 {

	public static void main(String[] args) {
		int x=1;
		while(true) {
			if(rule(x)) {
				System.out.println(x);
				break;
			}
			x++;
		}
	}
	static boolean rule (int x) {
		int x6[]=new int[10];
		int x5[]=new int[10];
		int x4[]=new int[10];
		int x3[]=new int[10];
		int x2[]=new int[10];
		int x1[]=new int[10];
		int i=6*x;
		while(i!=0) {
			x6[i%10]+=1;
			i/=10;
		}
		i=5*x;
		while(i!=0) {
			x5[i%10]+=1;
			i/=10;
		}
		i=4*x;
		while(i!=0) {
			x4[i%10]+=1;
			i/=10;
		}
		i=3*x;
		while(i!=0) {
			x3[i%10]+=1;
			i/=10;
		}
		i=2*x;
		while(i!=0) {
			x2[i%10]+=1;
			i/=10;
		}
		i=x;
		while(i!=0) {
			x1[i%10]+=1;
			i/=10;
		}
		for(int j=0; j<10; j++) {
			if(x6[j]!=x5[j]||x6[j]!=x4[j]||x6[j]!=x3[j]||x6[j]!=x2[j]||x6[j]!=x1[j]||x5[j]!=x4[j]||x5[j]!=x3[j]||x5[j]!=x2[j]||x5[j]!=x1[j]||x4[j]!=x3[j]||x4[j]!=x2[j]||x4[j]!=x1[j]||x3[j]!=x2[j]||x3[j]!=x1[j]||x2[j]!=x1[j]) {
				return false;
			}
		}
		return true;
	}
}
