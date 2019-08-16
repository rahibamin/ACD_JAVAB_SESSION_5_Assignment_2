package Session5.Assignment2;

import java.util.Scanner;

public class Rectangle extends figureClass {
	
	int lenght;
	double width;

	Scanner sc = new Scanner(System.in);

	public void findArea() {
		System.out.print("Enter the Lenght: ");
		lenght = sc.nextInt();
		System.out.print("Enter the Width: ");
		width = sc.nextInt();
		double rectangleArea = (lenght*width);
		System.out.println();
		System.out.println("Your Rectangle Area is " + rectangleArea);
		System.out.println();
	}

	public void findPerimeter() {
		System.out.print("Enter the Lenght: ");
		lenght = sc.nextInt();
		System.out.print("Enter the Width: ");
		width = sc.nextInt();
		double rectanglePerimeter = (2*lenght*width);
		System.out.println();
		System.out.println("Your Circle Perimeter is " + rectanglePerimeter);
		System.out.println();
	}

}
