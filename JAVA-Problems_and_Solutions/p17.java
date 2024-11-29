//QUESION


/*17.DEFINE A CLASS POINT WITH MEMBERS
§ PRIVATE DOUBLE X;
§ PRIVATE DOUBLE Y;
AND METHODS:
§ PUBLIC POINT(DOUBLE X, DOUBLE Y){}  // CONSTRUCTOR TO CREATE A NEW POINT?
§ PUBLIC DOUBLE SLOPE(POINT P2){} // FUNCTION TO RETURN THE SLOPE OF THE LINE FORMED FROM CURRENT POINT AND ANOTHER POINT
(ASSUME THAT INPUT WILL ALWAYS BE CHOSEN SO THAT SLOPE WILL NEVER BE INFINITE)
 */


/*
    TEST CASE:
        Input:
            0 0
            2 2
        Output:
             Slope: 1.0
        
 */


//ANSWER


import java.util.Scanner;
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double slope(Point p2) {
        double slope;
        slope = (p2.y - y) / (p2.x - x);
        return slope;
    }
}
public class p17{         
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        System.out.print("Slope: "+p1.slope(p2));
    }
}