 /* Super Key Word in Java 
    It is used to access parent class from the subclass
 */ 

class Box{
    int h,w,l;
    Box(){             //Constructor with default settings
        h = 0;
        w = 0;
        l = 0;
    }

    Box(int h ,int w, int l){   //Constructir with user defined settings
        this.h =h;
        this.w = w;
        this.l = l;
    }
    void display(){
        System.out.printf("The height of the box is %d and the width is %d and the length is %d \n",h,w,l);
    }
}
 
class Boxweight extends Box{
    int m;
    Boxweight(){
        super();   // Calling the parent class constructor
        m = 0;
     }
     Boxweight(int h,int w, int l ,int m){
        super();
        this.m = m;
     }
     void display(){
        System.out.printf("The height of the box is %d and the width is %d and the length is %d and the materials is %d \n",h,w,l,m);
    }
}
 class superConstructor {
    public static void main(String[] args) {
        Box b1 = new Box();//Default Setting
        Box b2 = new Box(23,33 ,3);//UserDefined Setting
        Boxweight bw1 = new Boxweight();//Default Setting
        Boxweight bw2 = new Boxweight(12,23,45,67);//UserDefined Setting
        b1.display();
        b2.display();
        bw1.display();
        bw2.display();
    }
}
