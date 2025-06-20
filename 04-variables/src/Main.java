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

        // to combine text and variables, you can use the + operator
        System.out.println("Integer: " + myNum);

        // also you can use the + operator to combine variable to another variable
        String fName = "Aravinda";
        String lName = "Gamage";
        String fullName = fName + " " + lName;
        System.out.println("Full Name: " + fullName + "\n");

        // for numbers, you can use the + operator to add them
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum: " + sum + "\n");

        // to declare multiple variables of the same type, you can do it in one line
        int a = 1, b = 2, c = 3;
        // print the multiple variables     
        System.out.println("Multiple Variables: a = " + a + ", b = " + b + ", c = " + c + "\n");
        // to declare multiple variables of different types, you can do it in one line
        int d = 4; float e = 5.5f; char f = 'G'; boolean g = false; String h = "World"; 
        // print the multiple variables of different types
        System.out.println("Multiple Variables of Different Types: d = " + d + ", e = " + e + ", f = " + f + ", g = " + g + ", h = " + h + "\n");
        
        // also you can assign the same value to multiple variables of the same type
        int i, j, k;
        // assign the same value to multiple variables
        i = j = k = 10;
        // print the variables  
        System.out.println("Same Value to Multiple Variables: i = " + i + ", j = " + j + ", k = " + k + "\n");
    }
}
