import java.math.BigInteger;
import java.util.ArrayList;
public class problem055 {

	/**soruda 0 dan 10000 e kadar olan ve 50 adımda(kendisiyle tersinin toplanması işlemi 1 adım kabul ediliyor.) palindromic ol-
	 * mayan sayıların sayısını soruyor. ben ekrana çıktı alıp en son sonucu yazdırmayı tercih ettim.
	 * 
	 */
	public static void main(String[] args) {
		
		int sayac=0;
		BigInteger i=new BigInteger("0");	
		boolean stop=false;
		while(!stop){
			i=i.add(BigInteger.ONE);
			
				BigInteger buffer=i;
				boolean kural=true;
				for(int ax=0; ax<50; ax++){
					buffer=buffer.add(ters(buffer));
					if(palindromic(buffer)){
						kural=false;
					}
					
				}
				if (kural){
					sayac++;
					System.out.println(i);
				}
			
			BigInteger onbin=new BigInteger("10000");
			if(i.equals(onbin)){
				stop=true;
			}
			

			
		}
		System.out.println("cevap="+sayac);
	}
	public static boolean palindromic (BigInteger i){
		BigInteger value= i;
		boolean kural=true;
		ArrayList<Integer> liste = new ArrayList<Integer>();
		BigInteger ten = new BigInteger("10");
		while (!value.equals(BigInteger.ZERO))
		{
		    liste.add(0, value.mod(ten).intValue());
		    value = value.divide(ten);
		}
		value = i;
		int length=liste.size();
		
		
		
		int dizi[]=new int[length];
		for(int a=0; a<length; a++){
			dizi[a]=(value.mod(ten).intValue());
			 value = value.divide(ten);
		}
		
		for(int a=0; a<length; a++){
			if(dizi[a]!=dizi[length-(1+a)]){
				kural=false;
			}
		}
		return kural;
		
	}
	public static BigInteger ters (BigInteger i){
		BigInteger value= i;
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		BigInteger ten = new BigInteger("10");
		while (!value.equals(BigInteger.ZERO))
		{
		    liste.add(0, value.mod(ten).intValue());
		    value = value.divide(ten);
		}
		value = i;
		int length=liste.size();
		
		
		
		int dizi[]=new int[length];
		for(int a=0; a<length; a++){
			dizi[a]=(value.mod(ten).intValue());
			 value = value.divide(ten);
		}
		String vektor=dizi[0]+"";
		BigInteger ters=new BigInteger(vektor);
		for(int a=1; a<length; a++){
			ters=ters.multiply(ten);
			String vektor2=dizi[a]+"";
			BigInteger vektor21=new BigInteger(vektor2);
			ters=ters.add(vektor21);
		}
		
		return ters;
		
	}


}

