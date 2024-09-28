import java.util.*;

class func{


    int sum(int n , int m){
        return n+m;
    }

    String name(String s){
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        func function1 = new func();
        func function2 = new func();
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt() , n2 = sc.nextInt();
        System.out.println("Enter your name: ");
        String s = sc.next();
        sc.close();
        int sums = function1.sum(n1, n2);
        System.out.println("The sum is "+sums);
        System.out.println("The name you entered: "+function2.name(s));
    }
}