//Answer:73682
public class Problem031 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=0; i<=1; i++){//200 penny
			for(int i1=0; i1<=2; i1++){//100 penny
				for(int i2=0; i2<=4; i2++){//50 penny
					for(int i3=0; i3<=10; i3++){//20 penny
						for(int i4=0; i4<=20; i4++){//10 penny
							for(int i5=0; i5<=40; i5++){//5 penny
								for(int i6=0; i6<=100; i6++){//2 penny
									for(int i7=0; i7<=200; i7++){//1 penny
										int sum=(200*i)+(100*i1)+(50*i2)+(20*i3)+(10*i4)+(5*i5)+(2*i6)+(1*i7);
										if(sum==200){
											counter++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
	}

}
