class A{
    int i;
}

class B extends A{
    int i; // This i hides the i in the A(super or parent class) called name collision
    B(int a, int b){
        super.i = a; //i in the A (to overcome name collision)
        i=b; // i in B
    }
    void show(){
        System.out.println("The value are " + super.i +" in A "+ i +" in B.");
    }
}

class superVariable{
    public static void main(String[] args) {
        B b = new B(12, 23);
        b.show();
        
    }
}