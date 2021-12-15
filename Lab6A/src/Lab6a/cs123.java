package Lab6a;

import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
        // Variable Declaration
		double base, height, width, area1, area2, total_area;
		// Reads keyboard
		Scanner pam = new Scanner (System.in);
		// Prompts user to enter base, height, and width
		System.out.print("Enter the value of base, height, and width in feet: ");
		base=pam.nextDouble();
		height=pam.nextDouble();
		width=pam.nextDouble();
	    // Method calls for triangle area 
		area1 = Train_area(base, height);
	    // Method calls for rectangle area
		area2 = Rect_area(base, width);
		// Adds area1 and area2 to get total area
		total_area = area1 + area2 ;
		//Results 
		System.out.print("Total Surface area of the shape: "+total_area);
		
		}
	
	// Static method (Train_area) declaration and calculate area of the triangle
	public static double Train_area(double base, double height)
	{
	return 0.5*base*height;
	}
	// Static method (Rect_area) declaration and calculate area of the rectangle
	public static double Rect_area(double base, double width)
	{
	return width*base;
	}
	
}
