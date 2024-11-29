//QUESTION


/*8.CREATE A CLASS RECTANGLE WITH ATTRIBUTES LENGTH AND WIDTH.
PROVIDE TWO CONSTRUCTORS: ONE WITH NO PARAMETERS (DEFAULT TO 1) AND
ANOTHER WITH PARAMETERS TO INITIALIZE THE ATTRIBUTES.
USE THE THIS KEYWORD TO AVOID NAME SPACE COLLISION.
CREATE A GETAREA() FUNCTION THAT RETURNS THE AREA OF THE RECTANGLE.
GUIDELINE TO SOLVE:
§ DEFINE THE RECTANGLE CLASS WITH ATTRIBUTES AND CONSTRUCTORS.
§ DEFINE A DEFAULT RECTANGLE CONSTRUCTOR THAT INIALIZES LENGTH AND WIDTH TO 1.
§ USE THE THIS KEYWORD IN THE PARAMETERIZED CONSTRUCTOR.
§ DEFINE A GETAREA() FUNTION THAT RETURNS THE AREA OF THERE RECTANGLE
*/


/*
    TEST CASE:
        Input:
            2
            3
        Output:
            Default Rectangle: L, W, A : 1.0, 1.0, 1.0
            Parameterised Rectangle: L, W, A : 2.0, 3.0, 6.0
*/


//ANSWER


import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
class p8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        // System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        // System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterised Rectangle: L, W, A : ");
        System.out.print(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}