package euler;

public class problem145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check=true;
		long sum=0;
		long counter=0;
		for(long a=10; a<=1000000000; a++){//number generator we will bruteforce these numbers
			long reverse=0;
			//reverse of number codes starts here
			long buffer=a;
			long lengtha= (long)(Math.log10(a)+1);
			long digits[]=new long[(int) lengtha];
			for(long i=0; i<lengtha; i++){
				digits[(int)i]=buffer%10;
				buffer/=10;
			}
			for(long i=0; i<lengtha; i++){
				reverse*=10;
				reverse+=digits[(int)i];
			//reverse of number codes ends here
				
			sum=a+reverse;
			
			//checking the sum's digits if are they odd?
			long buffsum=sum;
			
			check=true;//reset the check value.
			for(long k=0; k<(long)(Math.log10(sum)+1); k++){
				if(buffsum%2==0){
					check=false;
				}
				buffsum/=10;
			}
			
			}
			if(check&&a%10!=0){
				counter++;
				//System.out.println(a+"  +  "+reverse+"  =  "+sum);//printing the number considering the rule
			}	
		}
		
		System.out.println("counter="+counter);
	}

}//counter=608720
