//Answer:1074
public class Problem018 {

	public static void main(String[] args) {//There is exactly 2^14=16384 routes, for checking all routes won't take too much time. 
		int sum=0;
		int maxsum=0;
		int q2[]={95,64};
		int q3[]={17,47,82};
		int q4[]={18,35,87,10};
		int q5[]={20,04,82,47,65};
		int q6[]={19,01,23,75,03,34};
		int q7[]={88,02,77,73,07,63,67};
		int q8[]={99,65,04,28,06,16,70,92};
		int q9[]={41,41,26,56,83,40,80,70,33};
		int q10[]={41,48,72,33,47,32,37,16,94,29};
		int q11[]={53,71,44,65,25,43,91,52,97,51,14};
		int q12[]={70,11,33,28,77,73,17,78,39,68,17,57};
		int q13[]={91,71,52,38,17,14,91,43,58,50,27,29,48};
		int q14[]={63,66,04,68,89,53,67,30,73,16,69,87,40,31};
		int q15[]={04,62,98,27,23,9,70,98,73,93,38,53,60,04,23};
		for(int a2=0; a2<2; a2++){
			for(int a3=a2; a3<a2+2; a3++){
				for(int a4=a3; a4<a3+2; a4++){
					for(int a5=a4; a5<a4+2; a5++){
						for(int a6=a5; a6<a5+2; a6++){
							for(int a7=a6; a7<a6+2; a7++){
								for(int a8=a7; a8<a7+2; a8++){
									for(int a9=a8; a9<a8+2; a9++){
										for(int a10=a9; a10<a9+2; a10++){
											for(int a11=a10; a11<a10+2; a11++){
												for(int a12=a11; a12<a11+2; a12++){
													for(int a13=a12; a13<a12+2; a13++){
														for(int a14=a13; a14<a13+2; a14++){
															for(int a15=a14; a15<a14+2; a15++){
																sum=((q2[a2]+q3[a3]+q4[a4]+q5[a5]+q6[a6]+q7[a7]+q8[a8]+q9[a9]+q10[a10]+q11[a11]+q12[a12]+q13[a13]+q14[a14]+q15[a15])+75);
																if(sum>maxsum){
																	maxsum=sum;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(maxsum);
	}

}
