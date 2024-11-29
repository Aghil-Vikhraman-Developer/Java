//Question


/*
24.WRITE A  PROGRAM TO CREATE AN INTERFACE FLYABLE WITH A METHOD CALLED FLY_OBJ().
CREATE THREE CLASSES SPACECRAFT, AIRPLANE, AND HELICOPTER THAT IMPLEMENT THE FLYABLE INTERFACE.
IMPLEMENT THE FLY_OBJ() METHOD FOR EACH OF THE THREE CLASSES.
(REMEMBER TO MATCH THE OUTPUT GIVEN EXACTLY, INCLUDING THE SPACES AND NEW LINES)
 */


/*
    Test Case:
        Input and Output:
            Spacecraft is flying
            Airplane is flying
            Helicopter is flying
 */


//Answer


interface Flyable {
    // Declare the abstract method "fly_obj" that classes implementing this interface must provide
    void fly_obj();
}
// Declare the Spacecraft class, which implements the Flyable interface
class Spacecraft implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Spacecraft is flying
        System.out.println("Spacecraft is flying");
    }
}

// Declare the Airplane class, which implements the Flyable interface
class Airplane implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Airplane is flying
        System.out.println("Airplane is flying");
    }
}

// Declare the Helicopter class, which implements the Flyable interface
class Helicopter implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Helicopter is flying
        System.out.print("Helicopter is flying");
    }
}
public class p24 {
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}