//çalýþtýr
package euler;

public class Problem072 {

	public static void main(String[] args) {
		int counter=0;
		for(int d=2; d<=1000000; d++){
			if(d%1000==0)
				System.out.println("denenen="+d+" sayaç="+counter);
			for(int n=2; n<d; n++){
				if(findGCD(n,d)==1){
					counter++;
				}
			}
		}
		System.out.println("cevap="+counter);
	}
	private static int findGCD(int number1, int number2) { 
		//base case 
		if(number2 == 0){
		 return number1;
		 } 
		return findGCD(number2, number1%number2); 
		}



}
