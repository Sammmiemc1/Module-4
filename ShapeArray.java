import java.awt.Shape;

public class ShapeArray {

	public static void main(String[] args) {

		System.out.println("Shapes:");
      
		

		Shape shapeArray[] = new Shape[3];
		
		shapeArray[0] = new Circle(3); 
		shapeArray[1] = new Rectangle(5,7);
		shapeArray[2] = new Triangle(24, 30, 18);
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}
		
		
	}

}
