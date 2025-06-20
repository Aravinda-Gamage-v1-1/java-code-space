public class Main {
    public static void main(String[] args) {
        // create a string variable
        String name = "Aravinda";
        // print the string variable    
        System.out.println("Name: " + name + "\n");

        // crate a integer variable
        int age = 26;
        // print the integer variable
        System.out.println("Age: " + age + "\n");

        // crate a variable without assigning a value
        int birthYear;
        // assign a value to the variable
        birthYear = 1998;   
        // print the variable
        System.out.println("Birth year: " + birthYear + "\n");

        // overwrite the variable
        int height = 170;
        // print the variable   
        System.out.println("Height: " + height + "\n");
        // overwrite the variable with a new value      
        height = 175;
        // print the variable again     
        System.out.println("New Height: " + height + "\n");

        // create a final variable
        final String country = "India";
        // try to overwrite the final variable (this will cause a compile-time error)
        // country = "USA"; // Uncommenting this line will cause an error
        // print the final variable
        System.out.println("Country: " + country + "\n");

        // create variables of different data types
        // int, float, char, boolean, and String
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
