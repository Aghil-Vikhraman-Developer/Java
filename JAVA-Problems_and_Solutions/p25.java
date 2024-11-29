//Question


/*
 25.WRITE A PROGRAM TO CREATE AN INTERFACE PLAYABLE WITH A METHOD PLAY() THAT TAKES NO ARGUMENTS AND RETURNS VOID.
CREATE THREE CLASSES FOOTBALL, VOLLEYBALL, AND BASKETBALL THAT IMPLEMENT THE PLAYABLE INTERFACE AND OVERRIDE THE PLAY() METHOD TO PLAY THE RESPECTIVE SPORTS
 */


/*
    Test Case:
        Input and Output:
                Playing football
                Playing volleyball
                Playing basketball
 */


//Answer

interface Playable {
    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}
class Football implements Playable {
  public void play() {
    System.out.println("Playing football");
    // Add code to play football
  }
}
// Declare the Volleyball class, which implements the Playable interface
class Volleyball implements Playable {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that volleyball is being played
        System.out.println("Playing volleyball");
        // Additional code to play volleyball can be added here
    }
}
// Declare the Basketball class, which implements the Playable interface
class Basketball implements Playable {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that basketball is being played
        System.out.print("Playing basketball");
        // Additional code to play basketball can be added here
    }
}
public class p25 {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}
