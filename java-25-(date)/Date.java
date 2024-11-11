import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class

public class Date {
  public static void main(String[] args) {
    LocalDate myObj1 = LocalDate.now(); // Create a date object
    System.out.println(myObj1); // Display the current date

    LocalTime myObj2 = LocalTime.now();
    System.out.println(myObj2);
  }
}