import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Triangle extends Shape implements java.awt.Shape {
	 
	double length_side1;  
	double length_side2; 
	double length_side3; 

	
    public Triangle(double length_side1, double length_side2, double length_side3) {
        this.length_side1 = length_side1;
        this.length_side2 = length_side2;
        this.length_side3 = length_side3;
    }

	@Override
	public double area() {
		double p = (length_side1 + length_side2 + length_side3) / 2;

		return Math.sqrt(p * (p - length_side1) * (p - length_side2) * (p - length_side3));
	}

	@Override
	public double perimeter() {

		return (length_side1 + length_side2 + length_side3) / 2 ;
	}
	

    public String toString() {
		return  "Triangle Perimeter: " + perimeter() + " Triangle Area: " + area();
    	
    }

	@Override
	public Rectangle getBounds() {
	
		return null;
	}

	@Override
	public Rectangle2D getBounds2D() {
		
		return null;
	}

	@Override
	public boolean contains(double x, double y) {
		
		return false;
	}

	@Override
	public boolean contains(Point2D p) {
		
		return false;
	}

	@Override
	public boolean intersects(double x, double y, double w, double h) {
		
		return false;
	}

	@Override
	public boolean intersects(Rectangle2D r) {
		
		return false;
	}

	@Override
	public boolean contains(double x, double y, double w, double h) {
		
		return false;
	}

	@Override
	public boolean contains(Rectangle2D r) {
	
		return false;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		
		return null;
	}
    

}