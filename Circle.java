import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Shape implements java.awt.Shape {
	
	double radius = 3;
	double pi = Math.PI;
	double circle_perimeter;
	double circle_area;
	
   public Circle(double radius) {
        this.radius = radius;
    }
   
   
   public String toString() {
		return  "Circle perimeter: " + area() + " Circle Area: " + perimeter();
   	
   }
   
	@Override
	public double area() {
		return pi * Math.pow(radius, 2); 
	}

	@Override
	public double perimeter() {
		return 2 * pi * radius;
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