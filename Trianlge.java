package Session5.Assignment2;

import java.util.Scanner;

public class Trianlge extends figureClass {
	
	double a;
	double b;
	double c;

	Scanner sc = new Scanner(System.in);

	public void findArea() {
		System.out.print("Enter the Hight: ");
		a = sc.nextInt();
		System.out.print("Enter the Base: ");
		b = sc.nextInt();
		double triangleArea = ((a*b)/2);
		System.out.println();
		System.out.println("Your Triangle Area is " + triangleArea);
		System.out.println();
	}

	public void findPerimeter() {
		System.out.print("Enter the Lenght A: ");
		a = sc.nextInt();
		System.out.print("Enter the Lenght B: ");
		b = sc.nextInt();
		System.out.print("Enter the Lenght C: ");
		c = sc.nextInt();
		double trianglePerimeter = (a*b*c);
		System.out.println();
		System.out.println("Your Triangle Perimeter is " + trianglePerimeter);
		System.out.println();
	}

}
