//Answer:983
import java.util.*;
public class Problem026 {

	public static void main(String[] args) {
		int maxlength=0;
		int num=0;
		for(int i=1000; i>=1; i--) {
			if(recurringcyclelength(i)>maxlength) {
				maxlength=recurringcyclelength(i);
				num=i;
			}
		}
		System.out.println(num);

	}
	private static int recurringcyclelength(int n) {
		Map<Integer,Integer> stateToIter = new HashMap<>();
		int state = 1;
		for (int iter = 0; ; iter++) {
			if (stateToIter.containsKey(state))
				return iter - stateToIter.get(state);
			else {
				stateToIter.put(state, iter);
				state = state * 10 % n;
			}
		}
	}

}
