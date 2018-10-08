//Answer:21124
public class Problem017 {

	public static void main(String[] args) {
		//For being sure I listed all numbers.
				long counter=0;
				
				for(int i=1; i<=1000; i++)
				{
					
					int x=i;
					
					int a=0, b=0, c=0, d=0;
					
					while (x>0)
					{
						d=(x%10);
						x/=10;
						c=(x%10);
						x/=10;
						b=(x%10);
						x/=10;
						a=(x%10);
						x/=10;
					}
					
					String ones[]=new String[10];
					ones[0]="";
					ones[1]="one";
					ones[2]="two";
					ones[3]="three";
					ones[4]="four";
					ones[5]="five";
					ones[6]="six";
					ones[7]="seven";
					ones[8]="eight";
					ones[9]="nine";
					
					String tens[]=new String[10];
					tens[0]="";
					tens[1]="";
					tens[2]="twenty";
					tens[3]="thirty";
					tens[4]="forty";
					tens[5]="fifty";
					tens[6]="sixty";
					tens[7]="seventy";
					tens[8]="eighty";
					tens[9]="ninety";
					
					String hundreds[]=new String [10];
					hundreds[0]="";
					hundreds[1]="one";
					hundreds[2]="two";
					hundreds[3]="three";
					hundreds[4]="four";
					hundreds[5]="five";
					hundreds[6]="six";
					hundreds[7]="seven";
					hundreds[8]="eight";
					hundreds[9]="nine";
					
					String thousands[]= new String [10];
					thousands[0]="";
					thousands[1]="one";
					thousands[2]="two";
					thousands[3]="three";
					thousands[4]="four";
					thousands[5]="five";
					thousands[6]="six";
					thousands[7]="seven";
					thousands[8]="eight";
					thousands[9]="nine";
					
					String a1=thousands[a];
					String a2="thousand";
					String a3=hundreds[b];
					String a4="hundred";
					String a5="and";
					String a6=tens[c];
					String a7=ones[d];
					
					String arr[]=new String[10];
					arr[0]="ten";
					arr[1]="eleven";
					arr[2]="twelve";
					arr[3]="thirteen";
					arr[4]="fourteen";
					arr[5]="fifteen";
					arr[6]="sixteen";
					arr[7]="seventeen";
					arr[8]="eighteen";
					arr[9]="nineteen";
					
					
					if(c==1)
					{
						a1=thousands[a];
						a3=hundreds[b];
						a6=arr[d];
						
						
						if(a==0)
							{
							a1="";
							a2="";
							}
						if(b==0)
						{
							a3="";
							a4="";
							
						}
						if(c==0&&d==0)
						{
							a5="";
							a6="";
							a7="";
						}
						if(a==0&&b==0)
						{
							a5="";
						}
						
						
						
						a7="";
						System.out.print(i);
						System.out.println(a1+a2+a3+a4+a5+a6+a7);
						counter+=(a1.length()+a2.length()+a3.length()+a4.length()+a5.length()+a6.length()+a7.length());
						if(i==1000)
						{
							System.out.println(counter);
						}
					}
					else
						{
						a1=thousands[a];
						a3=hundreds[b];
						a6=tens[c];
						a7=ones[d];
						
						if(a==0)
							{
							a1="";
							a2="";
							}
						if(b==0)
						{
							a3="";
							a4="";
							
						}
						if(c==0&&d==0)
						{
							a5="";
							a6="";
							a7="";
						}
						if(a==0&&b==0)
						{
							a5="";
						}
						
						System.out.print(i+"=");
						System.out.println(a1+a2+a3+a4+a5+a6+a7);
					    counter+=(a1.length()+a2.length()+a3.length()+a4.length()+a5.length()+a6.length()+a7.length());
						if(i==1000)
						{
							System.out.println(counter);
						}
						
						
						}

				}

	}

}
