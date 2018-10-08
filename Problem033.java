//Answer:100
public class Problem033 {

	public static void main(String[] args) {
		int productnum=1;
		int productdenom=1;
		for(int denom=11;denom<=99; denom++){
			for(int num=10; num<denom; num++){
				int newnum=0;
				int newdenom=0;
				int num10=num/10;
				int num1=num%10;
				int denom10=denom/10;
				int denom1=denom%10;
				if(num10==denom10){
					newnum=num%10;
					newdenom=denom%10;
				}
				if(num10==denom1&&num10!=0){
					newnum=num%10;
					newdenom=denom/10;
				}
				if(num1==denom10&&num1!=0){
					newnum=num/10;
					newdenom=denom%10;
				}
				if(num1==denom1&&num1!=0){
					newnum=num/10;
					newdenom=denom/10;
				}
				if(newnum*denom==newdenom*num&&newnum!=0&&newdenom!=0){
					productnum*=newnum;
					productdenom*=newdenom;
				}
				
			}
		}
		for(int i=productnum; i>=0; i++) {
			if(productnum%i==0&&productdenom%i==0) {
				productdenom/=i;
				productnum/=i;
			}
		}
		System.out.println(productdenom);
	}
}
