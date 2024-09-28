
class factorial {

    int recFac(int n){
            if(n==0){
                return 1;
            }else{
                return(n*recFac(n-1));
            }
    }

    public static void main(String[] args) {
        factorial f1 =new factorial();
        int x=f1.recFac(Integer.parseInt(args[0]));
        System.out.println("The factorial of "+ Integer.parseInt(args[0]) + " is " + x);

    }    
}
