package xxx;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
	
	/*
	   $$$$$
	   $$$$
	   $$$
	   $$
	   $
	 */
	
	//1
		System.out.println("for...for... Loop:");	
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("$");
			}System.out.println("");
		}System.out.println("=============");
		
	//2
		System.out.println("for...while... Loop:");
		for(int i = 0; i < 5; i++) {
			int j = 5;
			while(j > i) {
				j--;
				System.out.print("$");
			}System.out.println("");
		}System.out.println("=============");
		
	//3
		System.out.println("while...while... Loop:");
		int i = 0;
		while(i < 5) {
			i++;
			int j = 5;
			while(j >= i) {
				j--;
				System.out.print("$");
			}System.out.println("");
		}System.out.println("=============");
	
	//4
		
		int z = 0;
		System.out.println("while...do...while... Loop:");
		while(z < 5) {
			z++;
			int k = 5;
			do {
				k--;
				System.out.print("$");
			}while(k >= z);
			System.out.println("");
		}
	
	}
}
