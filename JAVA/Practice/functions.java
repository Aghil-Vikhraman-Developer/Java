import java.util.*;

class functions {
    
    String oddOrEven(int n){
        if(n%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        functions f1 = new functions();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The result is "+ f1.oddOrEven(n));
    }
}
