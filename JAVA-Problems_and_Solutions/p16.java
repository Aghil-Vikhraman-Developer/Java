//QUESION


//16.COMPLETE THE CODE SEGMENT TO SWAP TWO NUMBERS USING CALL BY OBJECT REFERENCE.


/*
    TEST CASE:
        Input:
            6 11
        Output:
             Before Swap: 6 11
             After Swap: 11 6
*/


//ANSWER


//Prefixed Fixed code
import java.util.Scanner;
class Question {   //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class p16 {
public static void swap(Question t) {
    int temp = t.e1;
    t.e1 = t.e2;
    t.e2 = temp;
  }
public static void main(String[] args) {
    Question t = new Question();
    System.out.println("Before Swap: " + t.e1 + " " + t.e2);
    swap(t);
    System.out.print("After Swap: " + t.e1 + " " + t.e2);
  }
}