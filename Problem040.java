//Answer:210
public class Problem040 {

	public static void main(String[] args) {
		String str=" ";
		long a=1;
		while(str.length()<=1000000) {
			str=str+""+a;
			a++;
		}
		System.out.println((Integer.valueOf(str.charAt(1))-48)*(Integer.valueOf(str.charAt(10))-48)*(Integer.valueOf(str.charAt(100))-48)*(Integer.valueOf(str.charAt(1000))-48)*(Integer.valueOf(str.charAt(10000))-48)*(Integer.valueOf(str.charAt(100000))-48)*(Integer.valueOf(str.charAt(1000000))-48));
	}

}
