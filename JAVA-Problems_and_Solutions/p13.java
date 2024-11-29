//QUESION


/*13.WRITE A PROGRAM TO PRINT THE FACTORIAL OF A NUMBER BY DEFINING A RECURSIVE METHOD NAMED 'FACTORIAL'.
FACTORIAL OF ANY NUMBER N IS REPRESENTED BY N! AND IS EQUAL TO 1*2*3*....*(N-1)*N. E.G.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
ALSO,
1! = 1
0! = 1
*/


/*
    TEST CASE:
        Input:
            0
        Output:
            1
        
 */


//ANSWER


import java.util.Scanner;
class p13{
public static int factorial(int x){
      if(x == 0 || x == 1){
        return 1;
      }
      else{
        return factorial(x-1)*x;
      }
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        in.close();
        System.out.print(factorial(x));   
  }
}