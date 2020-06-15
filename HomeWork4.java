package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		//int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95,15};
		//System.out.println("Q2:請輸入想要反轉的字串");
		//System.out.println("Q4:請輸入想要借的金額");
		//Scanner sc = new Scanner(System.in);
		//String b = sc.nextLine();		
		//String[] b ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"} ;
		//int money = sc.nextInt();
				
		HomeWork4 hw4 = new HomeWork4();
		//hw4.getArrayResult(a);	//Q1
		//hw4.reverseString(b);	//Q2
		//hw4.calStars(b);	//Q3
		//hw4.getMoney(money);	//Q4
		hw4.leapYear();	//Q5
		//hw4.calScore();  //Q6
		
	}
	
	/* 有個一維陣列如下:
	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 */
	public void getArrayResult(int[] intArray) {
		
		int sum = 0;
		double ave;
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];		
		}
		ave = sum / intArray.length;  //陣列之平均值
		//Copy原陣列
		int[] copy = Arrays.copyOf(intArray, intArray.length); 
		System.out.println("平均值為:" + ave + "大於平均值的數字有:");
		for(int i = 0; i < copy.length; i++) {
			if( copy[i] > ave) 
				System.out.print(intArray[i] +"\t ");
		}
	}
	
	/*請建立一個字串,經過程式執行後,輸入結果是反過來的
	例如String s = “Hello World”,執行結果即為dlroW olleH*/
	public void reverseString(String target) {
		
		int size = target.length();
		for(int i = size; i > 0; i--) {
			System.out.print(target.charAt((i-1))); //陣列索引值會等於陣列長度-1, 故charAt方法的參數要-1
		}
	}
	
	/*有個字串陣列如下 (八大行星):
	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)*/
			
	public void calStars(String[] stars) {
		char target;
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		
		//for迴圈輸出字串後利用charAt方法比對母音
		for(int j = 0; j < stars.length; j++) {
			for(int k = 0; k < stars[j].length(); k++) {
				target = stars[j].charAt(k);
				
				switch(target) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				}
			}
	
		}
		System.out.println("母音a, 一共有"+ a + "個");
		System.out.println("母音e, 一共有"+ e + "個");
		System.out.println("母音i, 一共有"+ i + "個");
		System.out.println("母音o, 一共有"+ o + "個");
		System.out.println("母音u, 一共有"+ u + "個");
	
	}
	
	/*
	 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
	員工編號: 25 19 27 共 3 人!」
	 */
	public void getMoney(int money) {
		int[][] staff = {{2500, 800, 500, 1000, 1200}, {25, 32, 8, 19,27}};
		int count = 0;
		System.out.println("有錢可借的員工編號:");
		for(int i = 0; i < staff[0].length; i++) {  //for只輸出員工編號
			if( money <= staff[0][i]) {  //for只輸出每個人有的錢來比對
				count++;   //找到可借錢的員工便加一次
				System.out.print(staff[1][i] + " ");
			}
		}System.out.println("共" + count + "人" );

	}
	
	//=========Advance=========
	
	/*
	 * 請設計一隻程式由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,它會顯示是該年的第幾天
	 */
	public void leapYear() {
		
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想要計算的西元年:");
		int year = sc.nextInt();
		
		System.out.println("請輸入想要計算的月份:");
		int month = sc.nextInt();
		
		System.out.println("請輸入想要計算的日期:");
		int day = sc.nextInt();
				
		
		//Check the input date value.
		while (year == 0) {    
			System.out.println("請重新輸入西元年");
			year = sc.nextInt();
		}
		while ((month == 0) || (month > 12)) {
			System.out.println("請重新輸入月份");
			month = sc.nextInt();
		}
		while ((day == 0) || (day > 31) || ((month == 2) && (day >= 29))) {
			System.out.println("請重新輸入日期");
			day = sc.nextInt();
		}
		
		//Check leap year.
		if (year % 4 == 0 || ((year % 100 == 0) && (year % 400 == 0) )) {  //leap year
			dayOfMonth[1] = 29;			//It's leap year so Feb is 29 days.
			for (int i = 0; i < (month-1); i++) {
				sum += dayOfMonth[i];    //Total days
			}
		}else {  //Not leap year
			while ((month == 2) && (day > 28) ) {
				System.out.println("請重新輸入日期");
				day = sc.nextInt();
			}
			for (int i = 0; i < (month-1); i++) {
				sum += dayOfMonth[i];}
		}
		System.out.println("西元" + year + "年, 第" + (sum + day) + "天");
		
	}
	
	/*
	 * 高分次數計算
	 */
	//Condition 1: Get the highest score in each test.
	//Condition 2: Find the student and add times.
	public void calScore() {
		int[][] scores = {
        {10, 35, 40, 100, 90, 85, 75, 70},
        {37, 75, 77, 89, 64, 75, 70, 95},
        {100, 70, 79, 90, 75, 70, 79, 90},
        {77, 95, 70, 89, 60, 75, 85, 89},
        {98, 70, 89, 90, 75, 90, 89, 90},
        {90, 80, 100, 75, 50, 20, 99, 75} };	
		
		int[] student = new int[8];
		int maxNum = 0;
		
		//Get the highest score.
		for (int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > maxNum) {
					maxNum = scores[i][j];
				}
			}
			for(int k = 0; k < student.length; k++) {
				if (scores[i][k] == maxNum) {
					student[k] ++;
				}
			}
			maxNum = 0;
		}
		for (int z = 0; z < student.length; z++) {		//Print each student's times.
			System.out.println((z+1) + "號的同學考最高分的次數為 " + student[z] + "次" );
		}		
		
	}
}
