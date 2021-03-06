
public class RectangleSAbs extends ShapeAbs {
	private double width;
	private double length;
	
	public RectangleSAbs() {
		this.width=1.0;
		this.length=1.0;
	}
	
	public RectangleSAbs(double width, double length) {
		this.width=width;
		this.length=length;
	}

	public RectangleSAbs(double width, double length,String color,boolean filled) {
		this.width=width;
		this.length=length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*width+2*length;
	}
	
	public String toString() {
		return "A Rectangle with width="+width+" and length="+length+", which is a subclass of ";
	}
}
