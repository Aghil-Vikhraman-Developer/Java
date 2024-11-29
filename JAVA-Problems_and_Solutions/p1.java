//QUESTION


//1.WRITE A JAVA PROGRAM TO PRINT THE AREA AND PERIMETER OF A RECTANGLE.


/*
    TEST CASE: 

    Input:
    2.5 
    6.8

    Output:
    Perimeter is 2*(6.8 + 2.5) = 18.60
    Area is 2.5 * 6.8 = 17.00 
 */

 
//ANSWER


import java.util.Scanner;
public class p1 { 
   public static void main(String[] strings) {
       double width ;
       double height;

       Scanner in = new Scanner(System.in);
       width = in.nextDouble();
       height = in.nextDouble();
       in.close();
// Calculate the perimeter of the rectangle
    double perimeter = 2 * (height + width);

    // Calculate the area of the rectangle
    double area = width * height;
// Print the calculated perimeter using placeholders for values
       System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);

// Print the calculated area using placeholders for values
       System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);    
   }
}