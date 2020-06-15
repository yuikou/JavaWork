package xxx;

public class ArrayTest2 {

	public static void main(String[] args) {
		ArrayTest2 tra = new ArrayTest2();
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		int[][] z = new int [3][3];
		
		for(int i = 0; i < z.length; i++) {
			for(int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		tra.printArray(x);
		tra.printArray(y);
		tra.printArray(z);
	}

	//此方法回傳一個int二維陣列
	public int[][] getRandomArray(){
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length;j++) {
				data[i][j] = (int)(Math.random()* 31);			     
			}
		}
		return data; //回傳二維陣列
	}
	
	public void printArray(int[][] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
	}
}
