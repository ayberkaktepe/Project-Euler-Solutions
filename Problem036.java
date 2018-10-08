//Answer:872187
public class Problem036 {

	public static void main(String[] args) {//1000000 in binary = 11110100001001000000. 
		int sum=0;
		for(int i=1; i<=1000000; i++) {
			if(isitPandigital(i)&&decimaltobinaryisitPandigital(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static  boolean isitPandigital(int a) {
		int buff=a;
		int digits[]=new int[(int)Math.log10(a)+1];
		for(int i=0; i<(int)Math.log10(a)+1; i++) {
			digits[(int)i]=(int)buff%10;
			buff/=10;
		}
		for(int i=0; i<(int)Math.log10(a)+1; i++) {
			if(digits[i]!=digits[(int)Math.log10(a)-i])
				return false;
		}
		return true;
	}

	static boolean decimaltobinaryisitPandigital (int i) {
		int buff=i;
		int buff1=i;
		if(i<=1)
			return true;
		int length=0;
		while(buff1!=0) {
			buff1/=2;
			length++;
		}
		int digits[]=new int[length];
		int counter=0;
		while(buff!=0) {
			digits[counter]=buff%2;
			counter++;
			buff/=2;
		}
		for(int j=0; j<digits.length; j++) {
			if(digits[j]!=digits[digits.length-1-j])
				return false;
		}
		return true;
	}

}
