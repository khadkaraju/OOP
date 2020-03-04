import java.util.Scanner;

/**
 * Name:- Raju Khadka CS2365-001 HW2 Part 2: Asks for the shape of polygon and
 * calculates the area of that polygon
 * 
 */
public class Area {

    public static void main(String[] args) {

        System.out.println("Please Enter The Shape Whose Area You Want To Be Calculated. "); // asks to enter the name
                                                                                             // of polynomial
        Scanner input1 = new Scanner(System.in); // scans the input

        String s = input1.nextLine();
        System.out.println(" You Entered " + s); // Displays the user input
        double PI = 3.14; // initilizing the value of PI

        if (s.equals("triangle")) // if condition when user inputs the triangle
        {
            // reads the user input for width and height of triangle
            System.out.println(" Please Enter the WIDTH of the triangle");
            double B = input1.nextDouble();

            System.out.println("Please Enter the of HEIGHT of triangle ");
            double H = input1.nextDouble();

            double Area1 = (B * H) / 2; // calculates the area of triangle
            System.out.println(" Area Of Triangle is " + Area1); // displays the area of triangle

        } else if (s.equals("rectangle")) // if condition when user inputs the rectangle
        {

            System.out.println(" Enter the LENGTH of the rectangle");
            double L = input1.nextDouble();

            System.out.println(" Enter the WIDTH of the rectangle");
            double b = input1.nextDouble();

            double Area2 = L * b;
            System.out.println(" Area of rectangle is " + Area2); // displays the area of rectangle

        } else if (s.equals("circle")) // if condition when user inputs the circle
        {
            System.out.println(" Enter the value of radius :");
            double r = input1.nextDouble();

            double Area3 = PI * r;
            System.out.println(" Area of Circle is " + Area3); // displays the area of circle
        } else {
            System.out.println("NOT VALID!!! \nPlease Enter The Valid Polygon!!! "); // displays error if the user enter
                                                                                     // different polygon except these
                                                                                     // three
        }
        input1.close();
    }
}