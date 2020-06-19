//çalýþtýr
package euler;

public class Problem070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double oran=0;
		double n1 = 0;
		
		for(double n=2; n<=1000000; n++){
			double phi=1;//n ile aralarýnda asal sayýlarýn sayýsý, phi fonksiyonu da denir.
			for(int check=2; check<n; check++){
				if(n%check!=0){
					phi++;
				}
			}
			double deneme=phi/n;
			if(deneme>=oran&&permutation(phi,n)){
				oran=deneme;
				n1=n;
				System.out.println(n+" phi="+phi );
			}
			
		}
		System.out.println("cevap= "+n1);
	}

	public static boolean permutation(double a, double b) {
		int [] digitsphi=new int[10];
		int [] digitsn=new int[10];
		int phi=(int)a;
		int n=(int)b;
		
		while(phi!=0){
			int digit=(int) (phi%10);
			phi/=10;
			switch (digit){
			case 0:digitsphi[0]++;
			case 1:digitsphi[1]++;
			case 2:digitsphi[2]++;
			case 3:digitsphi[3]++;
			case 4:digitsphi[4]++;
			case 5:digitsphi[5]++;
			case 6:digitsphi[6]++;
			case 7:digitsphi[7]++;
			case 8:digitsphi[8]++;
			case 9:digitsphi[9]++;
			default:;
			}
		}
		
			while(n!=0){
				int digit2=(int) (n%10);
				n/=10;
				switch (digit2){
				case 0:digitsn[0]++;
				case 1:digitsn[1]++;
				case 2:digitsn[2]++;
				case 3:digitsn[3]++;
				case 4:digitsn[4]++;
				case 5:digitsn[5]++;
				case 6:digitsn[6]++;
				case 7:digitsn[7]++;
				case 8:digitsn[8]++;
				case 9:digitsn[9]++;
				default:;
				}
		}
			boolean check=true;
			for(int i=0; i<=9; i++){
				if(digitsn[i]!=digitsphi[i]){
					check=false;
				}
			}
			return check;
	}


}
