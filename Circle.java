package Session5.Assignment2;

import java.util.Scanner;

public class Circle extends figureClass {

	int radius;
	double pi = 3.14;

	Scanner sc = new Scanner(System.in);

	public void findArea() {
		System.out.print("Enter the radius: ");
		radius = sc.nextInt();
		double circleArea = (radius*pi);
		System.out.println();
		System.out.println("Your Circle Area is " + circleArea);
		System.out.println();
	}

	public void findPerimeter() {
		System.out.print("Enter the radius: ");
		radius = sc.nextInt();
		double circlePerimeter = (2*radius * pi);
		System.out.println();
		System.out.println("Your Circle Perimeter is " + circlePerimeter);
		System.out.println();
	}


}
