
//Parent Class (for single inheritance only one sub class from the super class)
class A{
    int i,j;
    void show(){
        System.out.printf("The value of i is %d and k is %d\n" ,i,j);
    }
    void sum(){
        System.out.println("The sum of i and j is "+(i+j));
    }
}

//Derived Class (It can use the variables of the parent class and no need to initialize them here)
//So the i and j are not said here
class B extends A{
    int k;
    void show(){
        System.out.printf("The values of i , j and k are %d %d %d\n",i,j,k);
    }

    void sum(){
        System.out.println("The sum of the three integers i , j and k are "+(i+j+k));
    }
}


class single_inheritance {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.i = 10;
        a.j = 11;
        a.show();
        a.sum();
        b.i = 10;
        b.j = 20;
        b.k = 30;
        b.show();
        b.sum();
    }
    

}