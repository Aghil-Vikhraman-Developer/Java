/*
import java.util.*;

class challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.print(name +" "+ age);
        sc.close();
    }    
}
*/

import java.util.*;


class challenge1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d/e);
    }
}