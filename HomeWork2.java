package xxx;

public class HomeWork2 {

	public static void main(String[] args) {
		// 1~1000偶數和
		int sum = 0;
		for (int i = 0; i <= 1000; i += 2) {
			sum += i;
		}System.out.println("1~100的偶數和為" + sum);
		
		// 1~10的連乘積for
		int sum1 = 1;
		for (int i1 = 1; i1 <= 10; i1++) {
			sum1 *= i1;
		}System.out.println("(for loop)1~10的連乘積為" + sum1);
		
		//1~10的連乘積while
		int sum2 = 1;
		int i2 = 1;
		while(i2 <= 10) {
			sum2 *= i2;
			i2++;
		}System.out.println("(while loop)1~10的連乘積為" + sum2);
				
		//輸出1~10的次方
		for (int i = 1; i <= 10; i++) {
			int i3 = (int)Math.pow(i, 2);
			System.out.print(i3 + " ");
		}
	
	}

}
