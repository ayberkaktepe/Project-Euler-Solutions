
public class problem061 {

	/**DÜZENLENDİ---DİREK DOĞRU SONUCU VERİYOR!
	 *çıktı=8256 5625 2882 8128 2512 1281 toplamları=28684
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int a=0;//diziye eklemek için kullanılan sayı, her seferinde 0 lanacak.
		int sayaca=0;//kaç sayının aynı olduğunu tutucak. her seferinde 0 lanacak
		int sayac3=0;//dizilerdeki elemanlatı tutacak;
		int sayac4=0;
		int sayac5=0;
		int sayac6=0;
		int sayac7=0;
		int sayac8=0;
		int dizi3[]=new int[1000];
		int dizi4[]=new int[1000];
		int dizi5[]=new int[1000];
		int dizi6[]=new int[1000];
		int dizi7[]=new int[1000];
		int dizi8[]=new int[1000];
		while(x<=9999){
			x=(a*(a+1)/2);
			a++;
			if(x>=1000&&x<=9999){
				dizi3[sayac3]=x;
				sayac3++;
			}
		}
		a=0;
		x=0;
		while(x<=9999){
			x=(a*a);
			a++;
			if(x>=1000&&x<=9999){
				dizi4[sayac4]=x;
				sayac4++;
			}
		}
		a=0;
		x=0;
		while(x<=9999){
			x=(a*(3*a-1)/2);
			a++;
			if(x>=1000&&x<=9999){
				dizi5[sayac5]=x;
				sayac5++;
			}
		}
		a=0;
		x=0;
		while(x<=9999){
			x=(a*((2*a)-1));
			a++;
			if(x>=1000&&x<=9999){
				dizi6[sayac6]=x;
				sayac6++;
			}
		}
		a=0;
		x=0;
		while(x<=9999){
			x=(a*((5*a)-3)/2);
			a++;
			if(x>=1000&&x<=9999){
				dizi7[sayac7]=x;
				sayac7++;
			}
		}
		a=0;
		x=0;
		while(x<=9999){
			x=(a*(3*a-2));
			a++;
			if(x>=1000&&x<=9999){
				dizi8[sayac8]=x;
				sayac8++;
			}
		}
		a=0;
		x=0;
		for(int i3=0; i3<sayac3; i3++){
			for(int i4=0; i4<sayac4; i4++){

				for(int i5=0; i5<sayac5; i5++){
					if(dizi3[i3]==dizi4[i4]){
						break;
					}

					for(int i6=0; i6<sayac6; i6++){
						if(dizi3[i3]==dizi5[i5]||dizi4[i4]==dizi5[i5]){
							break;
						}

						for(int i7=0; i7<sayac7; i7++){
							if(dizi3[i3]==dizi6[i6]||dizi4[i4]==dizi6[i6]||dizi5[i5]==dizi6[i6]){
								break;
							}

							for(int i8=0; i8<sayac8; i8++){
								if(dizi3[i3]==dizi7[i7]||dizi4[i4]==dizi7[i7]||dizi5[i5]==dizi7[i7]||dizi6[i6]==dizi7[i7]){
									break;
								}
								
								if(dizi3[i3]==dizi8[i8]||dizi4[i4]==dizi8[i8]||dizi5[i5]==dizi8[i8]||dizi6[i6]==dizi8[i8]||dizi7[i7]==dizi8[i8]){
									break;
								}
								sayaca=0;
								int b3=0, s3=0, b4=0, s4=0, b5=0, s5=0, b6=0, s6=0, b7=0, s7=0, b8=0, s8=0;
								b3=dizi3[i3]/100;
								s3=dizi3[i3]%100;
								b4=dizi4[i4]/100;
								s4=dizi4[i4]%100;
								b5=dizi5[i5]/100;
								s5=dizi5[i5]%100;
								b6=dizi6[i6]/100;
								s6=dizi6[i6]%100;
								b7=dizi7[i7]/100;
								s7=dizi7[i7]%100;
								b8=dizi8[i8]/100;
								s8=dizi8[i8]%100;
								
								if(b3==s4||b3==s5||b3==s6||b3==s7||b3==s8){
									sayaca++;
								}
								if(b4==s3||b4==s5||b4==s6||b4==s7||b4==s8){
									sayaca++;
								}
								if(b5==s3||b5==s4||b5==s6||b5==s7||b5==s8){
									sayaca++;
								}
								if(b6==s3||b6==s4||b6==s5||b6==s7||b6==s8){
									sayaca++;
								}
								if(b7==s3||b7==s4||b7==s5||b7==s6||b7==s8){
									sayaca++;
								}
								if(b8==s3||b8==s4||b8==s5||b8==s6||b8==s7){
									sayaca++;
								}
								
								if(s3==b4||s3==b5||s3==b5||s3==b7||s3==b8){
									sayaca++;
								}
								if(s4==b3||s4==b4||s4==b5||s4==b7||s4==b8){
									sayaca++;
								}
								if(s5==b3||s5==b4||s5==b6||s5==b7||s5==b8){
									sayaca++;
								}
								if(s6==b3||s6==b4||s6==b5||s6==b7||s6==b8){
									sayaca++;
								}
								if(s7==b3||s7==b4||s7==b5||s7==b6||s7==b8){
									sayaca++;
								}
								if(s8==b3||s8==b4||s8==b5||s8==b6||s8==b7){
									sayaca++;
								}
								if(b3!=b4&&b3!=b5&&b3!=b6&&b3!=b7&&b3!=b8&&b4!=b5&&b4!=b6&&b4!=b7&&b4!=b8&&b5!=b6&&b5!=b7&&b5!=b8&&b6!=b7&&b6!=b8&&b7!=b8&&s3!=s4&&s3!=s5&&s3!=s6&&s3!=s7&&s3!=s8&&s4!=s5&&s4!=s6&&s4!=s7&&s4!=s8&&s5!=s6&&s5!=s7&&s5!=s8&&s6!=s7&&s6!=s8&&s7!=s8){
									if(sayaca==12){
										System.out.println(dizi3[i3]+" "+dizi4[i4]+" "+dizi5[i5]+" "+dizi6[i6]+" "+dizi7[i7]+" "+dizi8[i8]+" toplamları="+(dizi3[i3]+dizi4[i4]+dizi5[i5]+dizi6[i6]+dizi7[i7]+dizi8[i8]));
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
