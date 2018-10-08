//Answer:232792560
public class Problem005 {

	public static void main(String[] args) {

		long i=1;
		boolean rule=false;
		while(!rule) {
			if(i%1==0&&i%2==0&&i%3==0&&i%4==0&&i%5==0&&i%6==0&&i%7==0&&i%8==0&&i%10==0&&i%11==0&&i%12==0&&i%13==0&&i%14==0&&i%16==0&&i%17==0&&i%18==0&&i%19==0&&i%20==0) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
