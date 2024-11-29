//QUESTION


/*9.CREATE A CLASS CIRCLE THAT ENCAPSULATES THE PROPERTIES OF A CIRCLE.
THE CLASS SHOULD HAVE A PRIVATE FIELD FOR THE RADIUS, A CONSTRUCTOR TO INITIALIZE THE RADIUS, AND METHODS TO CALCULATE THE AREA AND CIRCUMFERENCE OF THE CIRCLE.
NOTE: USE MATH.PI FOR PI CALCULATIONS (DO NOT USE 22/7)
GUIDELINE TO SOLVE:
§ DEFINE THE CIRCLE CLASS WITH ATTRIBUTES AND CONSTRUCTORS.
§ USE THE THIS KEYWORD IN THE PARAMETERIZED CONSTRUCTOR.
§ DEFINE A GETAREA() FUNTION THAT RETURNS THE AREA OF THERE CIRCLE (USE MATH.PI)
§ DEFINE A GETCIRCUMFERENCE() FUNTION THAT RETURNS THE CIRCUMFERENCE OF THERE CIRCLE (USE MATH.PI)
*/


/*
    TEST CASE:
        Input:
            1.0
        Output:
             Area: 3.14
             Circumference: 6.28
*/


//ANSWER


import java.util.Scanner;
class Circle {
    // Private field
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Create circle object
        Circle circle = new Circle(radius);

        // Calculate and print area
        double area = circle.calculateArea();
        // Print area to 2 decimal places
        System.out.printf("Area: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.calculateCircumference();
        // Print circumference to 2 decimal places
        System.out.printf("Circumference: %.2f", circumference);
        scanner.close();
    }
}