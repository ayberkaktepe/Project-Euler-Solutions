//Answer:1.533776805E9
//1533776805
public class Problem045 {

	public static void main(String[] args) {
		int counter=0;
		double n=0;
		double triangle=0;
		while(counter<3) {
			triangle=(n*(n+1))/2;//triangle number generator
			if(isitPentagonal(triangle)&&isitHexagonal(triangle)) 
				counter++;
			n++;
		}
		System.out.println(triangle);
		
	}
	public static boolean isitPentagonal(double a) {
		double b1=(1+Math.sqrt(24*a+1))/6;
		if(b1%1==0&&b1>0)
			return true;
		double b2=(1-Math.sqrt(24*a+1))/6;
		if(b2%1==0&&b2>0)
			return true;		
		return false;
	}
	public static boolean isitHexagonal(double a) {
		double b1=(1+Math.sqrt(8*a+1))/4;
		if(b1%1==0&&b1>0)
			return true;
		double b2=(1-Math.sqrt(8*a+1))/4;
		if(b2%1==0&&b2>0)
			return true;
		return false;
	}
}
