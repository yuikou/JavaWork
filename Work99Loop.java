package xxx;

public class Work99Loop {

	public static void main(String[] args) {
		
		nineNineFW();
		nineNineWW();
		nineNineWD();

	}
	
	//for + while
	public static void nineNineFW() {
		System.out.println("9*9 table by for...while");
		for(int i = 1; i <= 9; i++) {
			int j = 0;
			while(j < 9) {
				j++;
				System.out.print( i*j + " ");
			}System.out.println("");
		}
		System.out.println("======================");
	}
	
	//while + while
	public static void nineNineWW() {
		System.out.println("9*9 table by while...while");
		int i = 0;
		while(i < 9) {
			i++;
			int j = 0;
			while(j < 9) {
				j++;
				System.out.print( i*j + " ");
			}System.out.println("");
		}
		System.out.println("======================");
	}
	
	//while + do...while
	public static void nineNineWD() {
		System.out.println("9*9 table by while...do while");
		int i = 0;
		while(i < 9) {
			i++;
			int j = 0;
			do {
				j++;
				System.out.print( i*j + " ");
			}while(j < 9);
			System.out.println("");
		}
		
		
	}

}
