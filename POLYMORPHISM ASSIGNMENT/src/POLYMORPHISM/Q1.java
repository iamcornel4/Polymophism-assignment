package POLYMORPHISM;
class Shape{
	private String color;
	@Override
	public String toString() {
		return "Shape [Color ="+ color + "]";
	
	}
	public double getArea() {
		System.out.println("Area of a Shape : ");
		return 0;
		}
}
class Rectangle extends Shape{
	public Rectangle( String color, int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	private int length;
	private int width;
@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", toString()=" + super.toString() + ", getArea()="
				+ getArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public double getArea(String color, int length, int width) {
		System.out.println("Area of  a Rectangle : ");
		return length*width;
	}
	class Triangle extends Shape{
		public Triangle(int base, int height) {
			super();
			this.base = base;
			this.height = height;
		}

		private int base;
		private int height;
@Override 
		public String toString() {
			return "Triangle [base=" + base + ", height=" + height + ", toString()=" + super.toString() + ", getArea()="
					+ getArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
			
			public double getArea(String color, int base, int height) {
				System.out.println("Area of Triangle : ");
				return 0.5*base*height;
			}
		}
}
public class Q1 {
	public  static void  main (String [] args) {
		Shape kite = new Rectangle("voilet ", 6,  8);
		System.out.println(kite);
		System.out.println("Area is"+ kite.getArea());
	
		Shape hexagon = new Triangle("green", 6,  8 );
		System.out.println(hexagon);
		System.out.println("Area is " + hexagon.getArea());
		

	}
}

