//Answer:
public class Problem345{

	public static void main(String[] args) {
	/* 
	GEZGİN SATICI PROBLEMİNİN KESİN SONUCUNU VEREN ALGORİTMALARIN İTERASYON SAYISI YÜKSEKLİĞİ SEBEBİYLE DEZAVANTAJLI OLDUĞU ÇEŞİTLİ MAKALELERDE BELİRTİLMİŞTİR.
	İterasyon sayımız çok yüksek olduğu için sezgisel algoritmalar tercih edilebilir fakat sezgisel algoritmalar en iyi çözümü garanti edemez.
	Sezgisel çözüm için Excel evolutionary solver kullanıldığında çözdüğümüzde sonuç doğru çıktı. Değişkenler varsayılan olarak ele alınarak çözüm yapıtırıldı.
	Algoritmanın verimli olması için koşulu sağlamayan rotaların denenmesi engellenmiştir.
	Ayrıca paralel yapılabilecek işlemlerin her bir thread de paralel yapılması sağlanarak programın daha kısa sürede sonuç vermesi sağlanmıştır. Problemin sezgisel çözümü birkaç saniye alırken kesin çözümü 3 gün almaktadır.
	Bu problem sezgisel algoritmaların gerekliliğini ve başarısını gösterir niteliktedir.
	*/
		int[][] matrix = { 
				{  7,  53, 183, 439, 863, 497, 383, 563,  79, 973, 287,  63, 343, 169, 583},
				{627, 343, 773, 959, 943, 767, 473, 103, 699, 303, 957, 703, 583, 639, 913},
				{447, 283, 463,  29,  23, 487, 463, 993, 119, 883, 327, 493, 423, 159, 743},
				{217, 623,   3, 399, 853, 407, 103, 983,  89, 463, 290, 516, 212, 462, 350},
				{960, 376, 682, 962, 300, 780, 486, 502, 912, 800, 250, 346, 172, 812, 350},
				{870, 456, 192, 162, 593, 473, 915,  45, 989, 873, 823, 965, 425, 329, 803},
				{973, 965, 905, 919, 133, 673, 665, 235, 509, 613, 673, 815, 165, 992, 326},
				{322, 148, 972, 962, 286, 255, 941, 541, 265, 323, 925, 281, 601,  95, 973},
				{445, 721,  11, 525, 473,  65, 511, 164, 138, 672,  18, 428, 154, 448, 848},
				{414, 456, 310, 312, 798, 104, 566, 520, 302, 248, 694, 976, 430, 392, 198},
				{184, 829, 373, 181, 631, 101, 969, 613, 840, 740, 778, 458, 284, 760, 390},
				{821, 461, 843, 513,  17, 901, 711, 993, 293, 157, 274,  94, 192, 156, 574},
				{ 34, 124,   4, 878, 450, 476, 712, 914, 838, 669, 875, 299, 823, 329, 699},
				{815, 559, 813, 459, 522, 788, 168, 586, 966, 232, 308, 833, 251, 631, 107},
				{813, 883, 451, 509, 615,  77, 281, 613, 459, 205, 380, 274, 302,  35, 805},
			};
		IntStream.range(0, 14).parallel().forEach(a0->{
			int max=0;
			for(int a1=0; a1<=14; a1++){
				for(int a2=0; a2<=14; a2++){
					if(a1==a0)
						break;
					for(int a3=0; a3<=14; a3++){
						if(a2==a0||a2==a1)
							break;
						for(int a4=0; a4<=14; a4++){
							if(a3==a0||a3==a1||a3==a2)
								break;
							for(int a5=0; a5<=14; a5++){
								if(a4==a0||a4==a1||a4==a2||a4==a3)
									break;
								for(int a6=0; a6<=14; a6++){
									if(a5==a0||a5==a1||a5==a2||a5==a3||a5==a4)
										break;
									for(int a7=0; a7<=14; a7++){
										if(a6==a0||a6==a1||a6==a2||a6==a3||a6==a4||a6==a5)
											break;
										for(int a8=0; a8<=14; a8++){
											if(a7==a0||a7==a1||a7==a2||a7==a3||a7==a4||a7==a5||a7==a6)
												break;
											for(int a9=0; a9<=14; a9++){
												if(a8==a0||a8==a1||a8==a2||a8==a3||a8==a4||a8==a5||a8==a6||a8==a7)
													break;
												for(int a10=0; a10<=14; a10++){
													if(a9==a0||a9==a1||a9==a2||a9==a3||a9==a4||a9==a5||a9==a6||a9==a7||a9==a8)
														break;
													for(int a11=0; a11<=14; a11++){
														if(a10==a0||a10==a1||a10==a2||a10==a3||a10==a4||a10==a5||a10==a6||a10==a7||a10==a8||a10==a9)
															break;
														for(int a12=0; a12<=14; a12++){
															if(a11==a0||a11==a1||a11==a2||a11==a3||a11==a4||a11==a5||a11==a6||a11==a7||a11==a8||a11==a9||a11==a9)             
																break;
															for(int a13=0; a13<=14; a13++){
																if(a12==a0||a12==a1||a12==a2||a12==a3||a12==a4||a12==a5||a12==a6||a12==a7||a12==a8||a12==a9||a12==a10||a12==a11)             
																	break;
																for(int a14=0; a14<=14; a14++){
																	if(a13==a0||a13==a1||a13==a2||a13==a3||a13==a4||a13==a5||a13==a6||a13==a7||a13==a8||a13==a9||a13==a10||a13==a11||a13==a12)             
																		break;
																	if(a14!=a13&&a14!=a12&&a14!=a11&&a14!=a10&&a14!=a9&&a14!=a8&&a14!=a7&&a14!=a6&&a14!=a5&&a14!=a4&&a14!=a3&&a14!=a2&&a14!=a1&&a14!=a0){
																		int c=matrix[0][a0]+matrix[1][a1]+matrix[2][a2]+matrix[3][a3]+matrix[4][a4]+matrix[5][a5]+matrix[6][a6]+matrix[7][a7]+matrix[8][a8]+matrix[9][a9]+matrix[10][a10]+matrix[11][a11]+matrix[12][a12]+matrix[13][a13]+matrix[14][a14];
																		if(c>max){
																			max=c;
																		}
																	}																
																}																
															}
														}
													}
												}	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}
