package xxx;

public class HomeWork2_Adv {

	public static void main(String[] args) {
		// print出1~49之間, 個位數與十位數不含"4"的數字, 並得出共有幾個數字
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if( (i / 10 == 4) || (i % 10 == 4) ) {
				continue;
			}else {
				count++;
				System.out.print(i +" " );
			}
		}System.out.println();
		System.out.println("一共" + count +"個數字可供選擇");
		
		
//		12345678910
//		123456789
//		12345678
//		1234567
//		123456
//		12345
//		1234
//		123
//		12
//		1
		for (int i1 = 1; i1 <= 10; i1++) {
			for (int j = 1; j <= (10-(i1 - 1)); j++ ) { //第一排10, 第二排9因此條件式需為10的遞減, 所以讓10減去遞增的 (i1-1)
				System.out.print(j);
			}System.out.println();
		}
		//另一種寫法
		for(int a = 10; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}System.out.println();
		}
		
		//字元三角 \u0041=A
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		for(int i2 = 1; i2 <= 6; i2++) {
			for(int j1 = 1; j1 <= i2; j1++) {
				System.out.print((char)('\u0041'+(i2-1)));
			}System.out.println();
		}
		
	}

}
