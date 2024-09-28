import java.util.*;

class challenge3 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the starting number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter the ending number : ");
    int n2 = sc.nextInt();
    sc.close();
    System.out.println("The series of numbers from " + n1 + " to "+ n2 + " are: ");
    for(int i= n1 ; i<=n2; i++){
        System.out.print(i + " ");
    }
}    
}
