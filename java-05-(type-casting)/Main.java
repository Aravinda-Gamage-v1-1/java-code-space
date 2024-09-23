public class Main {
    public static void main(String[] args) {
      // Widening Casting
      int wCInt = 9;
      double wCDouble = wCInt; // Automatic casting: int to double
  
      System.out.println(wCInt);      // Outputs 9
      System.out.println(wCDouble);   // Outputs 9.0

      // Narrowing Casting
      double nCDouble = 9.78d;
      int nCInt = (int) nCDouble; // Manual casting: double to int
  
      System.out.println(nCDouble);   // Outputs 9.78
      System.out.println(nCInt);      // Outputs 9
    }
  }
