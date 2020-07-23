//çalýþýyor
/*
 * 7130034
 */

package euler;

public class problem166 {

	public static void main(String[] args) {
		/* 
		 * a b c * x
		 * d e f * y
		 * g h ý * z
		 * * * * i 10 deðer yetti
		 * k l m
		 */
		int counter=0;
		for(int a=0; a<=9; a++){
			for(int b=0; b<=9; b++){
				System.out.println("ilerleme="+a+" "+b+" ");
				for(int c=0; c<=9; c++){
					for(int d=0; d<=9; d++){
						for(int e=0; e<=9; e++){
							for(int f=0; f<=9; f++){
								for(int g=0; g<=9; g++){
									for(int h=0; h<=9; h++){
										for(int ý=0; ý<=9; ý++){
											for(int i=0; i<=9; i++){
												int sum=a+e+ý+i;
												int x=sum-(a+b+c);
												int y=sum-(d+e+f);
												int z=sum-(g+h+ý);
												int k=sum-(a+d+g);
												int l=sum-(b+e+h);
												int m=sum-(c+f+ý);
												if(x+y+z+i==sum&&k+l+m+i==sum&&x+f+h+k==sum){
													counter++;
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
		System.out.println("cevap="+counter);
	}

}
