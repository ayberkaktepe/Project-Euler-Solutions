//Answer:16695334890
/*
106357289
130952867
160357289
406357289
430952867
460357289
*/
public class Problem043 {
	public static void main(String[] args) {
		/*Every single digit increases calculation time logarithmically*/
		int arr[]=new int[9];
		for(int a=10000000; a<=999999999; a++){
			int buffer=a;
			for(int b=8; b>=0; b--){
				int digit=(buffer%10);
				arr[b]=digit;
				buffer/=10;
				}
			boolean rule=true;
			boolean zero=false;
			for(int x=0; x<9; x++){
				for(int y=0; y<9; y++){
					if(arr[x]==0||arr[y]==0)//Number should contain 0.
						zero=true;
					if(x!=y){
						if(arr[x]==arr[y])
							rule=false;
					}
				}
			}
			if(rule&&zero)
				if(kural(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]))
					System.out.println(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+""+arr[4]+""+arr[5]+""+arr[6]+""+arr[7]+""+arr[8]);
		}
	}
	public static boolean kural (int a0,int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8){
		int b0=((100*a0)+(10*a1)+(a2));
		int b1=((100*a1)+(10*a2)+(a3));
		int b2=((100*a2)+(10*a3)+(a4));
		int b3=((100*a3)+(10*a4)+(a5));
		int b4=((100*a4)+(10*a5)+(a6));
		int b5=((100*a5)+(10*a6)+(a7));
		int b6=((100*a6)+(10*a7)+(a8));
		
		if((b0%2==0&&b1%3==0&&b2%5==0&&b3%7==0&&b4%11==0&&b5%13==0&&b6%17==0))
			return true;
		return false;
	}
}
