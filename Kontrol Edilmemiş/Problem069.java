//çalýþtýr
package euler;

public class Problem069 {
//Euler's totient function ile çok daha verimli çözülebilir fakat uðraþmaya üþendim
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double oran=0;
		double n1 = 0;
		
		for(double n=1000000; n>2; n--){
			double phi=1;//n ile aralarýnda asal sayýlarýn sayýsý, phi fonksiyonu da denir.
			for(int check=2; check<n; check++){
				if(n%check!=0){
					phi++;
				}
			}
			double deneme=phi/n;
			if(deneme>=oran){
				oran=deneme;
				n1=n;
				System.out.println(n+" oran="+n/phi );
			}
			
		}
		System.out.println("cevap= "+n1);
	}

}
