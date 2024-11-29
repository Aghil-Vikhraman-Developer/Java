//Question


//21.WRITE A PROGRAM TO CREATE A METHOD THAT TAKES AN INTEGER AS A PARAMETER AND THROWS AN EXCEPTION IF THE NUMBER IS ODD.


/*
    Test Case:
        Input:
            9
        Output:
            Error: 9 is odd.
        
        Input:
            8
        Output:
            8 is even.
 */


//Answer


import java.util.*;

class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class p21 {
    public static void main(String[] args) {
     // int n = 18;
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      trynumber(n);
    }
public static void trynumber(int n) {
      try {
        checkEvenNumber(n);
        System.out.print(n + " is even.");
      } catch (IllegalArgumentException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
  
    public static void checkEvenNumber(int number) throws IllegalArgumentException {
      if (number % 2 != 0) {
        throw new IllegalArgumentException(number + " is odd.");
      }
    }
}

