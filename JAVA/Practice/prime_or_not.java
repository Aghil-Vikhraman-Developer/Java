class prime_or_not {
    public static void main(String[] args) {
    
        boolean isprime = true;
        int num = Integer.parseInt(args[0]);
        for(int i = 2 ; i<=num/2 ; i++){
            if(num%i==0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println("The number "+ num + " is prime");
        }else{
            System.out.println("The number "+ num + " is not prime");
        }
    }    
}
