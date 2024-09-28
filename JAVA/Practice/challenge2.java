import java.util.*;

class challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        sc.close();
        if(marks>35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


    }
}
