package Exception_Handling;

public class finally_keyword {
    public static void main(String[] args) {
        int err = 0;
        try {
            int i = 1;
            err = 0;
        } catch (Exception e) {
            // TODO: handle exception
            err=1;
        }
        finally{
            if(err == 1){
                System.out.println("There is exception to be handled buddy");
            }else{
                System.out.println("There is no exception to be handled buddy");
            }
        }
    }
}
