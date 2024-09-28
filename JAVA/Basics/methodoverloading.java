class methodoverloading {

    void display(){
        System.out.println("Without parameters");
    }
    void display(int a){
        System.out.println("With a single parameter.The parameter is "+a);
    }
    void display(int a, int b){
        System.out.println("With two parameters.The parameters are "+a+" and "+b);
    }

    public static void main(String[] args) {
        methodoverloading ml1 = new methodoverloading();
        ml1.display();
        ml1.display(10);
        ml1.display(10,20);
    }
}
