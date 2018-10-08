//Answer:906609
public class Problem004 {

	public static void main(String[] args) {

		int maxval=0;
		for(int i=999; i>=100; i--) {
			for(int j=999; j>=100; j--) {
				if(isitPalindromic(i*j)&&i*j>maxval) {
					maxval=i*j;
				}
			}
		}
		System.out.println(maxval);
		
		

	}
	public static boolean isitPalindromic (int num){
		int digit2=0;
		int buffer2=num;
		while(buffer2>0){
			buffer2/=10;
			digit2++;
		}
		int dizi2[]=new int[digit2];
		buffer2=num;
		for(int ax=0; ax<digit2; ax++){
			dizi2[ax]=buffer2%10;
			buffer2/=10;
			
		}
		boolean rule=true;
		for(int y=0; y<digit2; y++){
			
			if(dizi2[y]!=dizi2[digit2-y-1]){
				rule=false;
			}

		}
		return rule;
		
	}


}
