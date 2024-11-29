//QUESTION


//4.WRITE A JAVA PROGRAM TO MAKE SUCH A PATTERN LIKE A RIGHT ANGLE TRIANGLE WITH THE NUMBER INCREASED BY 1.


/*
    TEST CASE:

    Input:
        6
    Output:
        	
        1 
        2  3 
        4 5  6 
        7 8 9 1 0 
        11 12 13 14 1 5 
        16 17 18 19 20 21
 */


//ANSWER


import java.util.Scanner;

public class p4 {

  public static void main(String[] args)

  {
    int i, j, n, k = 1;

    //System.out.print("Input number of rows : ");

    Scanner in = new Scanner(System.in);
    n = in.nextInt();
for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++)
        System.out.print((k++) + " ");
      System.out.println();
    }
}
}