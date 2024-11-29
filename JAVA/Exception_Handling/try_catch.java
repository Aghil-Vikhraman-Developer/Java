package Exception_Handling;

public class try_catch {
    public static void main(String[] args) {
        try {
            int a = 10/0;//Arithmetic Exception
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[7]);//ArrayOutOfBound Exception

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println(e);
        }
    }
}
