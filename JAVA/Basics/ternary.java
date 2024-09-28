import java.util.*;

class ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number-2 : ");
        int n2 = sc.nextInt();
        sc.close();
        int res = (n1>n2)? n1:n2;
        System.out.println("The greatest among the numbers "+n1+" and "+n2+" is "+ res);
    }    
}
