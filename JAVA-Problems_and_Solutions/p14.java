//QUESION


/*14.WRITE A PROGRAM TO TAKE INTEGER INPUTS FROM USER UNTIL HE/SHE PRESSES Q ( ASK TO PRESS Q TO QUIT AFTER EVERY INTEGER INPUT ).
PRINT AVERAGE AND PRODUCT OF ALL NUMBERS.
*/


/*
    TEST CASE:
        Input:
            1
            2
            3
            4
            5
            q
        Output:
            Product is: 120
            Average is: 3.0
*/


//ANSWER


import java.util.*;

public class p14{
public static void main(String[] args) {

String choice = "";
Scanner input = new Scanner(System.in);
int sum = 0;
int product = 1;
int count = 0;
while(!choice.equals("q")){
    //System.out.println("Enter a number or q to quit");
    choice = input.next();

    if(!choice.equals("q")){
        int number = Integer.parseInt(choice);
        sum = sum+number;
        product = product*number;
        count++;
    }
} 
input.close();
System.out.print("Product is: "+product+"\nAverage is: "+((float)sum/count));
}
}