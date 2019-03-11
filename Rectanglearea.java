import java.util.Scanner; 
public class Rectanglearea{
	public static void main(String [] args){
		Rectangle area1= new Rectangle(10,10);
		System.out.println("Area of Rectangle 1 is "+area1.areaOfRectangle());
		System.out.println("Perimeter of Rectangle 1 is "+area1.perimeterOfRectangle());
	
		Rectangle area2=new Rectangle(10,10);
		System.out.println("Area of Rectangle 2 is "+area2.perimeterOfRectangle());
		System.out.println("Perimeter of Rectangle 2 is "+area2.perimeterOfRectangle());

		if(area1.areaOfRectangle()==area2.areaOfRectangle()){
			System.out.println("Both rectangles have same area of Rectangle");
		}	
	}
}