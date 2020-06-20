package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HomeWork5 {
	
	public static void main(String[] args) {
		int[][] intArray = { {1, 6, 3}, {9, 5, 2} };
		double[][] doubleArray = { {1.2, 3.5, 2.2}, {7.4, 2.1, 8.2} };
		HomeWork5 hw5 = new HomeWork5();
		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入寬:");
//		int w = sc.nextInt();
//		System.out.println("請輸入高:");
//		int h = sc.nextInt();
		
		//hw5.starSquare(w, h);	//Q1
		hw5.randAvg();	//Q2
		//hw5.randAvg2();	//Q2-2
		//System.out.println(hw5.maxElement(intArray));
		//System.out.println(hw5.maxElement(doubleArray));
		//hw5.genAuthCode();	//Q5
		hw5.getAuthCode2();
	
	}


	//Q1: 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與
	//高時,即會印出對應的*長方形
	public void starSquare(int width, int height){
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++ ) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	//Q2: 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值
	//並印出這10個亂數與平均值
	
	public void randAvg() {
		
		//Create 10 random number (0~100)
		int[] rand = new int[10];
		double sum = 0;
		
		System.out.println("10個亂數為:");
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int)(Math.random()*101);
			System.out.print(rand[i] + " ");
			sum += rand[i];
		}
		
		System.out.printf("%n平均值為:%.2f%n ", sum / rand.length);
		
	}
	public void randAvg2() {
		
		HashSet hs = new HashSet();
		while(hs.size() < 10) {
			int r = (int)(Math.random()*101);
			hs.add(r);
		}
		//Change HashSet to Object, then do down cast from object array to int array
		Object[] r1 = hs.toArray();
		int [] random = new int[r1.length];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) r1[i];	//downcast			
		}
		System.out.println("The ten number is" + hs.toString());
		
		// Get average of the array
		double sum = 0;
			for (int i = 0; i< random.length; i++) {
				sum += random[i];
			}
			
		System.out.printf("The average of 10 random number is [%.2f]", sum / random.length);
		
		}

	//Q3:利用Overloading,設計兩個方法double maxElement(int x[][])與double
//	maxElement(double x[][]),可以找出二維陣列的最大值並回傳
	
	public int maxElement(int x[][]) {
		int maxNum = 0;
		for (int[] row : x) {
			for(int val : row) {
				if (val > maxNum) {
					maxNum = val;
				}
			}
		}
		return maxNum;
	}
	public double maxElement(double x[][]) {
		double maxNum = 0.0;
		for (double[] row : x) {
			for(double val : row) {
				if (maxNum < val) {
					maxNum = val;
				}
			}
		}				
		return maxNum;
	}
	
	 /* 
	  * 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的
	  *功能,請設計一個方法void genAuthCode(),當呼叫此方法時,會回
	  *傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合
	 */
	
	void genAuthCode() {
			
		char[] auth = new char[8];
				
		for(int i = 0; i < auth.length; i ++) {
			int pattern = (int)((Math.random()*3)+1);
			switch(pattern) {
			//num (48 ~ 57 = 0 ~ 9) '0' in ASCII is 48
			case 1:
				auth[i] = (char)((Math.random()*10) + 48);
				break;
			//A-Z 'A' in ASCII is 65
			case 2:
				auth[i] = (char)((Math.random()*26) + 65);
				break;
			//a-z 'a' in ASCII is 97
			case 3:
				auth[i] = (char)((Math.random()*26) + 97);
				break;
			}
		}
	
		System.out.print("Here is your captcha: ");
		for (char row:auth) {
			System.out.printf("%1s", row);
		}
		
	}
	
	void getAuthCode2() {
		//Our target char in ASCII code is [48-57,65-90,97-122]
		int times = 0;
		System.out.print("Here is your captcha: ");
		while (times <= 8) {
			char r = (char)((Math.random()*75) + 48);  //Set the number range between 48-122.
			if (((r >= 48) && (r <= 57)) || ((r >= 65) && (r <= 90)) || ((r >= 97) && (r <= 122))) {
				System.out.print(r + "");
			}
			times++;
		}
		
	}


}

