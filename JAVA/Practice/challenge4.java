/*
 * 
 * Write a program to take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
 *  Print average and product of all numbers.
 * 
 * Sample Output
 * 1
 * 2
 * 3
 * 4
 * 5
 * q
 * Product is: 120\n
 * Average is: 3.0
 * 
 */

 import java.util.*;
 class challenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod = 1;
        int sum = 0;
        int count = 0;
        String choice = "";
        while (!choice.equals("q")) {
            choice = sc.next();
            // System.out.println("Q is printed");
            if(!choice.equals("q")){
                int number = Integer.parseInt(choice);
                sum = sum+number;
                prod = prod*number;
                count = count+1;
            }
        }
        sc.close();
        System.out.println("The Product is : "+prod+" .The Average is : "+((float)sum/count)+" .");

    }
    
 }
