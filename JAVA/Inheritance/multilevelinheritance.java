class Box{
    private double width;
    private double height;
    private double depth;

    Box(double w,double h,double d){ //parent of boxweight
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}

class Boxweight extends Box{//child of box and parent of shipment
    double weight;
    Boxweight(double w , double h , double d,double m){
        super(w,h,d);//points to the parent box
        weight = m;
    }

}

class Shipment extends Boxweight{ //child of boxweight
    double cost;
    Shipment(double w, double h, double d , double m ,double c){
        super(w,h,d,m);//points to the parent boxweight
        cost= c;
    }
}

class multilevelinheritance {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(10, 20, 15, 10, 3.41);
        double vol;
        vol = s1.volume();
        System.out.printf("Volume is %f weight is %f cost is %f",vol,s1.weight,s1.cost);
    }
    
}