//Question


/*23.WRITE A  PROGRAM TO CREATE A METHOD THAT TAKES A STRING AS INPUT AND THROWS AN EXCEPTION IF THE STRING DOES NOT CONTAIN VOWELS.
(NOTE: CHECK BOTH UPPER AND LOWER CASE VOWELS)
*/


/*
    Test Case:
        Input:
            This is NPTEL online course.
        Output:
            Original string: This is NPTEL online course.
            String contains vowels.
 */


//Answer


import java.util.Scanner;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

pulic class p23 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try {
        String text = input.nextLine();

        System.out.println("Original string: " + text);
        checkVowels(text);
        System.out.print("String contains vowels.");
      } catch (NoVowelsException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
public static void checkVowels(String text) throws NoVowelsException {
    if (!text.toLowerCase().matches(".*[aeiou].*")) {
        throw new NoVowelsException("String does not contain any vowels.");  
    }
}
}