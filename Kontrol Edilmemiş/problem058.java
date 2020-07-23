
public class problem058 {


	public static void main(String[] args) {
		//Spiral primes
		//Problem 58
		int genişlik=3;
		double Prime=0;
		double number=0;
		long a=1;
		long v=2;
		long sayac=0;
		while (10*Prime>=number){//eşit olsa da aşağıdaki if mekanizması hatalı sonucu önlüyor. 
						//eşit olmamalı çünkü eşit olunca 1 tane fazladan büyük sayı ekliyor
			if(sayac!=4){
				a+=v;
				sayac++;

				if(Prime(a)){
					Prime++;
					number++;
					System.out.println("genişlik="+genişlik+"eklenen sayı="+a+"oran="+(Prime/number));
				}
				else{
					number++;
				}
			}
			else{
				v+=2;
				genişlik+=2;
				sayac=0;
			}
			
			
		}
		System.out.println("genişlik="+genişlik);
		
		
	
	}
	public static boolean Prime (long n){
		boolean cevap=true;
		long sayac=2;
		if(n<2){
			cevap=false;
		}
		else{
			while(sayac<=(n/2)&&cevap){
				if(n%sayac==0){
					cevap=false;
				}
				else
					sayac++;
			}
		}
		
		return cevap;
	}

}
