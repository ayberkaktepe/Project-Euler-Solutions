package euler;


public class Problem113 {

	public static void main(String[] args) {
		/*
		 * bu soru 112. soru ile ayný mantýða sahip bir soru, aralarýndaki fark ise bu sorunun nonbouncy sayýsýný soruyor olmasý ve aralýðýn çok 
		 * geniþ olmasý.100 basamaklý sayýlarla uðraþmayý istemeyeceðimizden daha dinamik bir çözüm bulmalýyýz.Bu sorunun çok farklý þekillerle
		 * çözülebileceðini unutmamalýyýz.
		 * 
		 * ÇÖZÜM: çözüm 3 aþamada olacak, basamak deðerine göre artan, azalan sayýlarý hesaplayacaðýz ve kesiþim kümesini bu sayýlarýn toplamýn-
		 * dan çýkaracaðýz.
		 * 
		 * ARTIÞ
		 * 100 basamak olsun 9 adet de "/" iþaretimiz olsun "/" iþareti soldaki basamaktan saða geçerken sayýnýn 1 artacaðýný ifade etsin örneðin
		 * 000000000 sayýsýna önce "/"larý ekleyelim ardýndan gerekli sayý deðiþikliðini yapalým
		 * 000///0/00/00//0//0  kuralýn iþleyiþinin anlaþýlmasý için alt satýrda basamaklara gerekli sayýlar yerleþtirilecektir
		 * 0003445579    		artýþ kuralýnýn bu örnekle anlaþýldýðýný düþünüyorum ve formülü yazýyorum
		 * (109!/(100!*9!))-1   (-1 0 sayýsýný çýkarmak için! )
		 *
		 *AZALIÞ
		 *Bu sefer devreye bir 9 arttýrma sembolü girecek o sembolü & olarak belirleyelim
		 *elimizde 100 adet basamak sembolü olan "0", 9 adet azalýþ sembolü olan"/" ve 1 adet9 artýþ sembolü olan "&" var
		 *
		 *örnek 10 basamaklý sayý
		 *000//&0/00//00/0//0/ bu kurala göre sayýmýzý düzenlersek
		 *0009886653
		 *(110!/(100!*10!))-100-1  (-100 sayýsý en saðdaki ve &iþaretinin solundaki / lar için çýkarýldý. farklý dizilimlerle ayný sayýlar elde edilebiliyor çünkü)
		 *
		 *KESÝÞÝM KÜMESÝ SAYISI=
		 *BÜTÜN BASAMAKLARI AYNI OLAN 1 DEN 10^100 E KADAR OLAN SAYI SAYISI=9(basamaklarýn alabileceði deðer)*n(max basamak sayýsý);
		 *9n
		 *cevap=((109!/(100!*9!))-1)+((110!/(100!*10!))-100 )-900=8526843022542 //hesapmakinasý, wolframalpha, microsoft mathematics ile çözülebilir, yada Java
		 * BigInteger kütüphanesi ile çözülebilir, sabýrlýysanýz kaðýt kalem ile de çözülebilir. Program yazma gereði duymadým.
		 */        

	}


}
