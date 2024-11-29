//QUESTION


//6.COMPLETE THE CODE SEGMENT TO CALL THE METHOD  DISPLAY() OF CLASS FORMER FIRST AND THEN CALL DISPLAY() METHOD OF CLASS LATTER.


/*
    TEST CASE:
        Input and Output:
             This is Former Class.
             This is Latter Class.
*/


//ANSWER


// This is the class named Former
class Former {
    // This is a method in class Former
    public void display() {
        System.out.println("This is Former Class.");
    }
}

// This is the class named Latter
class Latter {
    // This is a method in class Latter
    public void display() {
        System.out.print("This is Latter Class.");
    }
}

public class p6{
    public static void main(String[] args) {
Former former = new Former();
Latter latter = new Latter();
former.display();
latter.display();
}
}