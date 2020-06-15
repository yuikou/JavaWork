package xxx;

import java.util.Scanner;
import java.util.HashSet;

public class HomeWork3 {

	public static void main(String[] args) {
		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		int[] intArray = new int[3];
		HomeWork3 hw3 = new HomeWork3();
		//hw3.getTriangle(intArray);
		//hw3.getNum();
		//hw3.getNumAdv();
		//hw3.lottery();
		hw3.lotteryAdv();
	}	

	public void getTriangle(int[] data) {
		int a;
		System.out.println("請輸入要判斷的數字:");
		for (int i = 0; i < data.length; i++) {
			
				Scanner sc = new Scanner(System.in);
				a = sc.nextInt();
				data[i] = a; 
			}
			int x = data[0];
			int y = data[1];
			int z = data[2];
			int b = (int)Math.pow(x, 2);
			int c = (int)Math.pow(y, 2);
			int d = (int)Math.pow(z, 2);
			
			if(((x+y)>z) || ((y+z)>x) || ((x+z)>y)) {
				if(x == y && x == z && y == z) {
					System.out.println("正三角形");
				}else if( (b+c == d) || (c+d == b) || (b+d == c) ) {
					System.out.println("等腰直角三角形");
				}else if( (x == y && x != z) || (y == z && y != x) || (z == x && z != y ) ){
					System.out.println("等腰三角形");
				}else{
					System.out.println("其他三角形");}
			}
			else {
				System.out.println("不是三角形");
			}
	 }
	
	//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
	public void getNum() {
		int num;
		int yourNum = 10;
		num = (int)(Math.random()*10); //產生0~9的亂數
		System.out.println("開始猜數字吧");
		
		while(num != yourNum) {
			Scanner sc = new Scanner(System.in);
			yourNum = sc.nextInt();
			System.out.println("猜錯喔");
		}System.out.println("答對了!答案就是" + num);	
	}
	
	//進階挑戰:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
	public void getNumAdv() {
		int num;
		int yourNum = 101;
		num = (int)(Math.random()*101); //產生0~100的亂數
		System.out.println("開始猜數字吧");
		
		while(num != yourNum) {
			Scanner sc = new Scanner(System.in);
			yourNum = sc.nextInt();
			System.out.println("猜錯喔");
			if(yourNum > num) {
				System.out.println("大於答案喔");
			}else if(yourNum < num){
				System.out.println("小於答案喔");
			}else if(yourNum == num){
				System.out.println("答對了!答案就是" + num);
			}
		}	
	}
	
	/*阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
	但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文
	可以輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數*/
	public void lottery() {
		int i;  //不要的號碼
		int count = 0;
		System.out.print("請輸入不要的數字:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		for(int j = 1; j <= 49; j++) {
			if(i == 0) {
				System.out.println("請重新輸入");
			}else {
				if((j / 10 == i) && (j % 10 == i)) {
					continue;
				}else {
					System.out.print(j + "\t");
					if (count % 7 == 0) System.out.print("\n");
					count++ ;
				}
			}
	//			if((j / 10 != i) && (j % 10 != i)) {
	//				count++ ;
	//				System.out.print(j + "\t");
	//			}
		}System.out.print("\n總共有" + count + "個字可以選");
	}
	
	//(樂透進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重覆)
	public void lotteryAdv() {
		int i;  //不要的號碼
		int randomNum; //樂透亂數
		System.out.print("請輸入不要的數字:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();  //產生不要的號碼
		HashSet hs = new HashSet(); //使用不會出現重複的hashset來存放
		while(hs.size() < 6) {
			randomNum = (int)((Math.random()*49)+1);
			if((randomNum / 10 != i) && (randomNum % 10 != i))  //過濾被選擇數字可能會出現的十位數數字與個位數數字
			hs.add(randomNum);
		}System.out.println( "系統給您的推薦號碼為:\n" + hs.toString()); //使用to String方法輸出剛剛產生的6個亂數
			
	}
	
}
