
package Sequential;
/**
 * sequential
 * in sequential every code execution goes line by line
 *
 */
public class sequential {

    public static void main(String[] args){ //parent thread
        demo1();
        demo2();
    }
    private static void demo1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("From demo1 "+i);
        }
    }
    private static void demo2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("From demo2 "+i);
        }
    }
}