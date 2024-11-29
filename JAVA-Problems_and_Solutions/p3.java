//QUESTION


//3.WRITE A JAVA PROGRAM TO DISPLAY N TERMS OF NATURAL NUMBERS AND THEIR SUM.


/*
  TEST CASE:

    Input:
        8
    Output:
        The first 8 natural numbers are : 
            1
            2
            3
            4
            5
            6
            7
            8
        The Sum of Natural Number upto 8 terms : 36
*/


//ANSWER


import java.util.Scanner;

public class p3 {

  public static void main(String[] args)

  {
    int i, n, sum = 0;
      Scanner in = new Scanner(System.in);
      System.out.print("Input number: ");
      n = in.nextInt();
      in.close();
    System.out.printf("The first %d natural numbers are : \n",n);
for (i = 1; i <= n; i++) {
      System.out.println(i);
      sum += i;
    }
System.out.printf("The Sum of Natural Number upto %d terms : %d",n,sum);
  }
}