import java.util.*;

class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed using while loop: ");
        int n = sc.nextInt();
        sc.close();
        while(n!=0){
            System.out.print(n+" ");
            n--;
        }
    }
    
}
