//QUESION


/*20.Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.
Example:

 Input: n = 5
------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6
*/


/*
    TEST CASE:
        Input:
            10
        Output:
            Sum: 36       
 */


//ANSWER


import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
int result = 1;
        int i = 0;
        while (result <= n) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    sum = sum + i;

                }
                result = result + 1;
            }
            i = i + 1;
        }
System.out.print("Sum: "+sum);// Suffixed Fixed Code:
        sc.close();
    }
}