package HomeWork;

public class MyRectangle {
	//實體變數
	private double width;
	private double depth;
	
	//建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	public MyRectangle() {
		this(40, 20);
	}
	//method
	void setWidth(double width) {
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;
	}
	public double getWidth() {
		return width;
	}
	public double getDepth() {
		return depth;
	}
	
	double getArea() {
		return width * depth;
		
	}

}
