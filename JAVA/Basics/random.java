import java.util.*;
class random {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(10); // prints number less than 10 that is n-1
        System.out.println(randomNumber);
    }
}
