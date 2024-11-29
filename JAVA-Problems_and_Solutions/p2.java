//QUESION


//2.WRITE A JAVA PROGRAM AND COMPUTE THE SUM OF AN INTEGER'S DIGITS.


/*
    Test Case 	
    Input:  234 
    Output:  The sum of the digits is: 9
    
*/


//ANSWER


import java.util.Scanner;

public class p2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();
        input.close();
        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
public static int sumDigits(long n) {
  int sum = 0;

  // Calculate the sum of the digits
  while (n != 0) {
    sum += n % 10;
    n /= 10;
  }
  return sum;
}
}
