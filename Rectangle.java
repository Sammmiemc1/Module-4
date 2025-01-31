import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape implements java.awt.Shape {
	
	double width;
	double length;

	
	
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
	
    public String toString() {
		return  "Rectangle Perimeter: " + area() + " Rectangle Area: " + perimeter();
    	
    }
    
    
	@Override
	public double area() {

		return width * length;
	}

	@Override
	public double perimeter() {

		return 2 * (length + width);
	}

	@Override
	public java.awt.Rectangle getBounds() {
		
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