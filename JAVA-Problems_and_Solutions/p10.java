//QUESTION


//10.COMPLETE THE CODE BY CREATING THE CONSTRUCTOR AND THE GETTER FUNCTIONS FOR A CLASS DOG AS DEFINED BELOW.


/*
    TEST CASE:
        Input:
            Jackie
            Doberman
            3
            Brown
        Output:
            Hi my name is: Jackie
            My breed is: Doberman
            My age is: 3
            My color is: Brown
*/


//ANSWER


import java.util.Scanner;

// Class Declaration
public class p10 {
    // Instance Variables
    private String name;
    private String breed;
    private int age;
    private String color;
public p10(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String breed = scanner.nextLine();
        int age = scanner.nextInt();
        String color = scanner.next();
        
        p10 tommy = new p10(name, breed, age, color);
        
        System.out.println("Hi my name is: " + tommy.getName());
        System.out.println("My breed is: " + tommy.getBreed());
        System.out.println("My age is: " + tommy.getAge());
        System.out.print("My color is: " + tommy.getColor());
        
        scanner.close();
    }
}