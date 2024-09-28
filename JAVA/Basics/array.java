import java.util.*;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[10];
        for(int i = 0; i<10 ; i++ ){
            arr[i]= sc.nextInt();
        }
        sc.close();
        int i = 0;
         while (i<arr.length){
            sum+=arr[i];
            i++;
         }
  
        System.out.println("The sum of the entered elements are : "+ sum);
    }    
}
