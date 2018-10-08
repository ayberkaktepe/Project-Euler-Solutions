//Answer:932718654
public class Problem038 {

	public static void main(String[] args) {
		int maxval=0;
		for(int i=1; i<=49382; i++) {//987654321 is biggest possible 1-9 pangidital number. 98765/2=49382,5
			String str="";
			int j=1;
			while(str.length()<9) {
				str=str+""+(i*j);
				j++;
			}
			if(isitPalindromic(str)) {
				int a=Integer.valueOf(str);
				if(a>maxval)
					maxval=a;
			}
		}
		System.out.println(maxval);

	}
	public static boolean isitPalindromic(String a){
		char[] chars=a.toCharArray();
		int num[]=new int[10];
		for(int i=0; i<chars.length; i++) {
			num[Character.getNumericValue(chars[i])]+=1;
		}
		if(num[0]==0&&num[1]==1&&num[2]==1&&num[3]==1&&num[4]==1&&num[5]==1&&num[6]==1&&num[7]==1&&num[8]==1&&num[9]==1)
			return true;
		return false;
	}

}
