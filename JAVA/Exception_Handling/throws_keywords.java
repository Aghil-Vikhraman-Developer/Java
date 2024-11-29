
import java.util.*;

class hello{
    void disp() throws Exception{
        System.out.println("hello");
    }
}
public class throws_keywords {
    public static void main(String[] args) {
        hello h1 = new hello();
        
        try{
            h1.disp();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
