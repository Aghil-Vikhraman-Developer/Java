class Vehichle{
    String brand;
    int year;
    void startEngine(){
        System.out.println("Start Engine......");
    }
}

class Car extends Vehichle{
    String fuelType;
    void startEngine(){
        @Override
        System.out.println("Engine started..");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}

class Truck extends Vehichle{
    int loadCapacity;
    void startEngine(){
        @Override
        System.out.println("Truck engine starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}

class challenge6 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand="Audi";
        c1.year=2023;
        c1.fuelType="Petrol";
        c1.startEngine();
    }
    
}