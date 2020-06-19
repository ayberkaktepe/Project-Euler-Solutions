package euler;


public class Problem113 {

	public static void main(String[] args) {
		/*
		 * bu soru 112. soru ile ayn� mant��a sahip bir soru, aralar�ndaki fark ise bu sorunun nonbouncy say�s�n� soruyor olmas� ve aral���n �ok 
		 * geni� olmas�.100 basamakl� say�larla u�ra�may� istemeyece�imizden daha dinamik bir ��z�m bulmal�y�z.Bu sorunun �ok farkl� �ekillerle
		 * ��z�lebilece�ini unutmamal�y�z.
		 * 
		 * ��Z�M: ��z�m 3 a�amada olacak, basamak de�erine g�re artan, azalan say�lar� hesaplayaca��z ve kesi�im k�mesini bu say�lar�n toplam�n-
		 * dan ��karaca��z.
		 * 
		 * ARTI�
		 * 100 basamak olsun 9 adet de "/" i�aretimiz olsun "/" i�areti soldaki basamaktan sa�a ge�erken say�n�n 1 artaca��n� ifade etsin �rne�in
		 * 000000000 say�s�na �nce "/"lar� ekleyelim ard�ndan gerekli say� de�i�ikli�ini yapal�m
		 * 000///0/00/00//0//0  kural�n i�leyi�inin anla��lmas� i�in alt sat�rda basamaklara gerekli say�lar yerle�tirilecektir
		 * 0003445579    		art�� kural�n�n bu �rnekle anla��ld���n� d���n�yorum ve form�l� yaz�yorum
		 * (109!/(100!*9!))-1   (-1 0 say�s�n� ��karmak i�in! )
		 *
		 *AZALI�
		 *Bu sefer devreye bir 9 artt�rma sembol� girecek o sembol� & olarak belirleyelim
		 *elimizde 100 adet basamak sembol� olan "0", 9 adet azal�� sembol� olan"/" ve 1 adet9 art�� sembol� olan "&" var
		 *
		 *�rnek 10 basamakl� say�
		 *000//&0/00//00/0//0/ bu kurala g�re say�m�z� d�zenlersek
		 *0009886653
		 *(110!/(100!*10!))-100-1  (-100 say�s� en sa�daki ve &i�aretinin solundaki / lar i�in ��kar�ld�. farkl� dizilimlerle ayn� say�lar elde edilebiliyor ��nk�)
		 *
		 *KES���M K�MES� SAYISI=
		 *B�T�N BASAMAKLARI AYNI OLAN 1 DEN 10^100 E KADAR OLAN SAYI SAYISI=9(basamaklar�n alabilece�i de�er)*n(max basamak say�s�);
		 *9n
		 *cevap=((109!/(100!*9!))-1)+((110!/(100!*10!))-100 )-900=8526843022542 //hesapmakinas�, wolframalpha, microsoft mathematics ile ��z�lebilir, yada Java
		 * BigInteger k�t�phanesi ile ��z�lebilir, sab�rl�ysan�z ka��t kalem ile de ��z�lebilir. Program yazma gere�i duymad�m.
		 */        

	}


}
