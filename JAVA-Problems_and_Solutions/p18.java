//QUESION


/*18.THIS PROGRAM TO EXERCISE THE CREATE STATIC AND NON-STATIC METHODS. 
A PARTIAL CODE IS GIVEN, YOU HAVE TO DEFINE TWO METHODS, NAMELY SUM( ) AND MULTIPLY( ).
 THESE METHODS HAVE BEEN CALLED TO FIND THE SUM AND PRODUCT OF TWO NUMBERS. COMPLETE THE CODE SEGMENT AS INSTRUCTED. 
*/


/*
    TEST CASE:
        Input:
            5 11
        Output:
             Sum: 16
             Product: 55    
 */


//ANSWER


import java.util.Scanner;

class QuestionScope {
int sum(int a, int b) { // non-static method
        return a + b;
    }

    static int multiply(int a, int b) { // static method
        return a * b;
    }
}

public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope(); // Create an object to call non-
                                                // static method
        sum = st.sum(n1, n2); // Call the method
        prod = QuestionScope.multiply(n1, n2);  // Create an object to call
                                                 // static method
        System.out.println("Sum: "+sum);
        System.out.print("Product: "+prod);
        sc.close();
    }
}