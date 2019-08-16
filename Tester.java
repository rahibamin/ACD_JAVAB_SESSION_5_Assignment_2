package Session5.Assignment2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true){

		System.out.print("Choose a shape Circle (C), Rectangle (R), Triangle (T), Exit (E) ");
		String action = sc.next();


		if (action.equalsIgnoreCase("C")) {
			Circle cl = new Circle();
			System.out.print("Area (A) or Perimeter (P) ");
			action = sc.next();
			if (action.equalsIgnoreCase("A")) {
				cl.findArea();
			}
			if (action.equalsIgnoreCase("P")) {
				cl.findPerimeter();
			}	
		}
		
		if (action.equalsIgnoreCase("R")) {
			Rectangle r = new Rectangle();
			System.out.print("Area (A) or Perimeter (P) ");
			action = sc.next();
			if (action.equalsIgnoreCase("A")) {
				r.findArea();
			}
			if (action.equalsIgnoreCase("P")) {
				r.findPerimeter();
			}	
		}
		
		if (action.equalsIgnoreCase("T")) {
			Trianlge t = new Trianlge();
			System.out.print("Area (A) or Perimeter (P) ");
			action = sc.next();
			if (action.equalsIgnoreCase("A")) {
				t.findArea();
			}
			if (action.equalsIgnoreCase("P")) {
				t.findPerimeter();
			}	
		}
		
		if (action.equalsIgnoreCase("E")) {
			System.out.println("Goodbye");
			System.exit(0);
		}
	}
	}
}
