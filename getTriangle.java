package xxx;

import java.util.Scanner;

public class getTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < r; i++) {
			for (int j = r; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= count; k++) {
				System.out.print("*");
			}
			count += 2;
			System.out.println("");
		}
	}

}
