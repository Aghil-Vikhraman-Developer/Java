class fibbonaci {

    int fiboseries(int n){
      
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return (fiboseries(n-1)+fiboseries(n-2));
        }
    }

    public static void main(String[] args) {
        fibbonaci fibo = new fibbonaci();
        int x = Integer.parseInt(args[0]);
        System.out.println("The fibonacci series of "+ x +" is " + fibo.fiboseries(x));

    }

}
