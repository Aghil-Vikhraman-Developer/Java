

import java.util.*;

/**
 * customException
 */
class customException extends Exception{
    public customException(String s){
        super(s);
    }
}
/**
 * custom_exception
 */
public class custom_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();
            if (age < 1) {
               throw new customException("Budd your input is improper");
            }
   
            System.out.println("Your age is " + age);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}
