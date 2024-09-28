import java.util.*;

class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            // System.out.println("Success");
        }while(n>10);
        sc.close();
    }
    
}
