package HomeWork;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle(10, 20);
		
		r1.setWidth(10);
		r1.setDepth(20);
		
		System.out.printf("The first rectangle's area is %.2f%n", r1.getArea());
		System.out.printf("The second rectangle's area is %.2f%n", r2.getArea());
		
		
	}

}
