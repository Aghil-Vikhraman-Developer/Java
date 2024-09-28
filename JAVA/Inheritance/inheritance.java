/* 
 * SINGLE INHERITANCE
*/


class inheritance {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.x = 10;
        p1.y=20;
        System.out.println("The Point 2D");
        p1.display();
        p2.x=22;
        p2.y=23;
        p2.z=24;
        System.out.println("The Point 3D");
        p2.display();
    }
}

class Point2D{
 
    int x;
    int y;
    void display(){
        System.out.printf("The values of x , y are respectively %d %d",x,y);
    }
}

class Point3D extends Point2D{
    int z = 9000;
    void display(){
        System.out.printf("The values of x , y and z are respectively %d %d %d" ,this.x,this.y,this.z );
    }
}