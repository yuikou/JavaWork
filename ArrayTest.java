package xxx;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [][] x = new int[3][3];
		int [][] y = new int[3][3];
		int [][] z = new int[3][3];
		
		//x Array
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length;j++) {
				x[i][j] = (int)(Math.random()* 30 +1);
			    //x[i][j] = (int)(Math.random()* 31)也可, 因產生的最大亂數取成整數會為30
				System.out.print(x[i][j] +",");
			}System.out.println();
		}System.out.println();
		
		//y Array
		for (int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[i].length;j++) {
				y[i][j] = (int)(Math.random()* 30 +1);
				System.out.print(y[i][j] +",");
			}System.out.println();
		}System.out.println();
		
		//z Array(x + y)
		for(int i = 0; i < z.length; i++) {
			for(int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] +",");
			}System.out.println();
		}
		

	}

}
