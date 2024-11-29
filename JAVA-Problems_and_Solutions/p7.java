//QUESTION


/*7.CREATE A CLASS STUDENT WITH PRIVATE ATTRIBUTES FOR NAME AND AGE.
USE A CONSTRUCTOR TO INITIALIZE THESE ATTRIBUTES AND PROVIDE PUBLIC GETTER METHODS TO ACCESS THEM.
IN THE MAIN METHOD, AN INSTANCE OF STUDENT IS CREATED AND THE STUDENT'S DETAILS ARE PRINTED.
GUIDELINE TO SOLVE:
§ DEFINE THE STUDENT CLASS WITH PRIVATE ATTRIBUTES.
§ USE A CONSTRUCTOR TO INITIALIZE THE ATTRIBUTES.
§ IMPLEMENT GETTER METHODS FOR THE ATTRIBUTES.
*/


/*
    TEST CASE:
        Input:
            Bob
            21
        Output:
             Student Name: Bob
             Student Age: 21
*/


//ANSWER


import java.util.Scanner;
class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
class p7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input
    // System.out.print("Enter name: ");
    String name = scanner.nextLine();
    // System.out.print("Enter age: ");
    int age = scanner.nextInt();

    // Create Student object
    Student student = new Student(name, age);

    // Print student details
    System.out.println("Student Name: " + student.getName());
    System.out.print("Student Age: " + student.getAge());

    scanner.close();
  }
}