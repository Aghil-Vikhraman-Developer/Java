package Exception_Handling;
import java.util.*;
public class throw_keyword {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            int age = sc.nextInt();
            if(age<1){
                throw new Exception("Budd your input is improper");
            }else{
                System.out.println("Your age is "+age);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
