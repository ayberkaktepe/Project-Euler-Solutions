

public class problem060 {
	
	/*İNANILMAZ YAVAŞ! AMA ÇALIŞIYOR. SAAT GİBİ KUSURSUZ!
	 * ilk bulunan değer en küçük değer değil. cevap 26033 çıkıyor. 30 binden sonrasına bakmak anlamsız. 
	 * program bok gibi yavaş. tek tek karşılaştırmaktan daha iyisini yapmaya çalıştım ama er yada geç 5 döngü içinde
	 * karşılaştırma yapmam gerekti buda performanstan inanılmaz ödün verdi.
	 * 2 dizi oluşturdum ilki asal sayı dizisi ikincisi ilk asal sayıya uyanlar dizisi 
	 * kalan bruteforce; kural sağlanırsa belleğe alacak.
	 */

	public static void main(String[] args) {

		int summin=999999;
		int dizi[]=new int[10000];
		int dizi2[]=new int[10000];
		int sayac=0;
		for(int aa=1; aa<=20000; aa++){
			if(Prime(aa)){
				dizi[sayac]=aa;
				sayac++;
			}
		}
		
		for(int i=0; i<sayac; i++){
			int sayac2=0;
			int lengthi= (int)(Math.log10(dizi[i])+1);
			int vektori=(int) Math.pow(10, (double)lengthi);
			for(int xyz=0; xyz<sayac; xyz++){
				int lengthx= (int)(Math.log10(dizi[xyz])+1);
				int vektorx=(int) Math.pow(10, (double)lengthx);
				int z1=vektorx*dizi[i]+dizi[xyz];
				int z2=vektori*dizi[xyz]+dizi[i];
				if(Prime(z1)&&Prime(z2)){
					dizi2[sayac2]=dizi[xyz];	
					sayac2++;
				}
			}
			for(int i1=0; i1<sayac2; i1++){
				if(dizi[i]+dizi2[i1]>summin){
					break;
				}
				int lengthi1= (int)(Math.log10(dizi2[i1])+1);
				int vektori1=(int) Math.pow(10, (double)lengthi1);
				int a1=vektori*dizi2[i1]+dizi[i];
				int a2=vektori1*dizi[i]+dizi2[i1];
				for(int i2=i1+1; i2<sayac2; i2++){
					if(dizi[i]+dizi2[i1]+dizi2[i2]>summin||dizi[i]==dizi2[i1]){
						break;
					}
					//ilk iki döngü eşit olabilir ama kalanlar olamaz. aynı dizide kendinden sonrakinden devam ediyor
					int lengthi2= (int)(Math.log10(dizi2[i2])+1);
					int vektori2=(int) Math.pow(10, (double)lengthi2);
					int a3=vektori*dizi2[i2]+dizi[i];
					int a4=vektori2*dizi[i]+dizi2[i2];
					int b1=vektori1*dizi2[i2]+dizi2[i1];
					int b2=vektori2*dizi2[i1]+dizi2[i2];
					
					for(int i3=i2+1; i3<sayac2; i3++){
						if(dizi[i]+dizi2[i1]+dizi2[i2]+dizi2[i3]>summin){
							break;
						}
						int lengthi3= (int)(Math.log10(dizi2[i3])+1);
						int vektori3=(int) Math.pow(10, (double)lengthi3);
						int a5=vektori*dizi2[i3]+dizi[i];
						int a6=vektori3*dizi[i]+dizi2[i3];
						int b3=vektori1*dizi2[i3]+dizi2[i1];
						int b4=vektori3*dizi2[i1]+dizi2[i3];
						int c1=vektori2*dizi2[i3]+dizi2[i2];
						int c2=vektori3*dizi2[i2]+dizi2[i3];
						
						for(int i4=i3+1; i4<sayac2; i4++){
							if(dizi[i]+dizi2[i1]+dizi2[i2]+dizi2[i3]+dizi2[i4]>summin){
								break;
							}
							int sum=0;
							int lengthi4= (int)(Math.log10(dizi2[i4])+1);
							int vektori4=(int) Math.pow(10, (double)lengthi4);
							int a7=vektori*dizi2[i4]+dizi[i];
							int a8=vektori4*dizi[i]+dizi2[i4];
							int b5=vektori4*dizi2[i1]+dizi2[i4];
							int b6=vektori1*dizi2[i4]+dizi2[i1];
							int c3=vektori4*dizi2[i2]+dizi2[i4];
							int c4=vektori2*dizi2[i4]+dizi2[i2];
							int d1=vektori3*dizi2[i4]+dizi2[i3];
							int d2=vektori4*dizi2[i3]+dizi2[i4];
							//System.out.println("denenen="+dizi[i]+" "+dizi2[i1]+" "+dizi2[i2]+" "+dizi2[i3]+" "+dizi2[i4]);	
							if(Prime(a1)&&Prime(a2)&&Prime(a3)&&Prime(a4)&&Prime(a5)&&Prime(a6)&&Prime(a7)&&Prime(a8)&&Prime(b1)&&Prime(b2)&&Prime(b3)&&Prime(b4)&&Prime(b5)&&Prime(b6)&&Prime(c1)&&Prime(c2)&&Prime(c3)&&Prime(c4)&&Prime(d1)&&Prime(d2)){
								sum=(dizi[i]+dizi2[i1]+dizi2[i2]+dizi2[i3]+dizi2[i4]);
								System.out.println("***kurala uyan sayılar***="+dizi[i]+" "+dizi2[i1]+" "+dizi2[i2]+" "+dizi2[i3]+" "+dizi2[i4]);
								if(sum<summin){
									summin=sum;
								}
							}						
						}
					}
				}
			}
		}
		System.out.println("summin="+summin);
	}
	 public static	boolean Prime(int n) {
		    if(n < 2) return false;
		    if(n == 2 || n == 3) return true;
		    if(n%2 == 0 || n%3 == 0) return false;
		    int sqrtN = (int)Math.sqrt(n)+1;
		    for(int i = 6; i <= sqrtN; i += 6) {
		        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
		    }
		    return true;
		}
	

}