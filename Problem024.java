//Answer:278391546
public class Problem024 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=0; i<=9; i++) {
			for(int i1=0; i1<=9; i1++) {
				for(int i2=0; i2<=9; i2++) {
					for(int i3=0; i3<=9; i3++) {
						for(int i4=0; i4<=9; i4++) {
							for(int i5=0; i5<=9; i5++) {
								for(int i6=0; i6<=9; i6++) {
									for(int i7=0; i7<=9; i7++) {
										for(int i8=0; i8<=9; i8++) {
											if(i!=i1&&i!=i2&&i!=i3&&i!=i4&&i!=i5&&i!=i6&&i!=i7&&i!=i8&&i1!=i2&&i1!=i3&&i1!=i4&&i1!=i5&&i1!=i6&&i1!=i7&&i1!=i8&&i2!=i3&&i2!=i4&&i2!=i5&&i2!=i6&&i2!=i7&&i2!=i8&&i3!=i4&&i3!=i5&&i3!=i6&&i3!=i7&&i3!=i8&&i4!=i5&&i4!=i6&&i4!=i7&&i4!=i8&&i5!=i6&&i5!=i7&&i5!=i8&&i6!=i7&&i6!=i8&&i7!=i8) {
												counter++;
												if(counter==1000000) {
													System.out.println(i+""+i1+""+i2+""+i3+""+i4+""+i5+""+i6+""+i7+""+i8);
													System.exit(0);
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
