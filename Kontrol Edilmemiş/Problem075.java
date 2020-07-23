//ekran çıktısı:161667
package euler;

public class problem075 {

	public static void main(String[] args) {
		/*
		 * a=m^{2}-n^{2}, b=2mn ,c=m^{2}+n^{2}
		 */
		int limit = 1500000;
		int[] triangles = new int[limit+1];
		 
		int result =0;
		int mlimit = (int)Math.sqrt(limit / 2);
		 
		for (long m = 2; m < mlimit; m++) {
		    for (long n = 1; n < m; n++) {
		        if (((n + m) % 2) == 1 && GCD(n, m) == 1) {
		            long a = m * m + n * n;
		            long b = m * m - n * n;
		            long c = 2 * m * n;
		            long p = a + b + c;
		            while(p <= limit){
		                triangles[(int)p]++;
		                if (triangles[(int)p] == 1) result++;
		                if (triangles[(int)p] == 2) result--;
		                p += a+b+c;
		            }
		        }
		    }
		}
		

		
		System.out.println(result);
	}
	public static long GCD (long x, long y){
		return (y==0) ? x : GCD(y, x%y);
	}

}
