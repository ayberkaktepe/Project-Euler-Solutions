package euler;

public class problem074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayac=0;
		for(int i=1;i<=1000000; i++){
			boolean check=true;
			int dizi[]=new int[61];
			dizi[0]=i;
			for(int j=1; j<=60;j++){
				dizi[(int)j]=factorialize(dizi[(int)j-1]);
			}
			for(int a=0; a<=59; a++){
				for(int b=a+1; b<=59; b++){
					if(dizi[(int)a]==dizi[(int)b]){
						check=false;
					}
				}
			}
			if (check){
				sayac++;
				
			}
			
		}
		System.out.println(sayac);
	}
private static int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	
	private static int factorialize(int n) {//that method returns the sum of the factorial of digits. value of digits can be 0,1,2,3,4,5,6,7,8,9.
		int sum = 0;
		for (; n != 0; n /= 10)
			sum += FACTORIAL[n % 10];
		return sum;
	}

}
