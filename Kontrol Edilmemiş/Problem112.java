package euler;

public class problem112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=100;//99
		long bouncy=0;
		long notbouncy=99;
		boolean check=false;
		while(!check){
			if(bouncy>=99*notbouncy){
				check=true;
				System.out.println("cevap="+(num-1));
				break;
			}
			boolean control1=true;
			boolean control2=true;
			long buffer=num;
			while(buffer>=10){
				long  buffer1=buffer%10;
				buffer=buffer/=10;
				long buffer2=buffer%10;
				if(buffer1<buffer2){//artan kuralý
					control1=false;
				}
				if(buffer1>buffer2){//azalan kuralý
					control2=false;
				}
				
			}

			if(control2==true||control1==true){
				notbouncy++;
				System.out.println(num+"notbouncy");
			}
			else {
			bouncy++;
			System.out.println(num+"bouncy");
			}
			num++;

		}
		System.out.println("bouncy="+bouncy);
		System.out.println("notbouncy="+notbouncy);

	}

}
