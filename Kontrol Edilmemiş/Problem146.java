		package euler;

		public class Problem146 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int per1500=580;
				long sum=0;
				for(long i=58000010;i<=150000000; i+=10){
					long square=i*i;
					if(isPrime(square+1)&&isPrime(square+3)&&isPrime(square+7)&&isPrime(square+9)&&isPrime(square+13)&&isPrime(square+27)){
						System.out.println(i);
						sum+=i;
					}
					if(i%100000==0){
						per1500++;
						System.out.println("***1500'de "+per1500+" tamamlandý***");
					}
				}
				System.out.println("sum="+sum);
			}
			static boolean isPrime(long n) {
			    if(n < 2) return false;
			    if(n == 2 || n == 3) return true;
			    if(n%2 == 0 || n%3 == 0) return false;
			    long sqrtN = (long)Math.sqrt(n)+1;
			    for(long i = 6L; i <= sqrtN; i += 6) {
			        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
			    }
			    return true;
			}

		}

