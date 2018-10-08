//Answer:171
import java.util.Calendar;
public class Problem019 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=1901; i<=2000; i++) {//y�l
			for(int j=1; j<=12; j++) {
				if((getDay(1,j,i))=="SUNDAY") {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
	public static String getDay(int day,int month,int year) {
	    String[] dates=new String[]{"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	    Calendar cal=Calendar.getInstance();
	    cal.set(year,month,day);
	    int date_of_week=cal.get(Calendar.DAY_OF_WEEK);
	    return dates[date_of_week-1];
	}

}
