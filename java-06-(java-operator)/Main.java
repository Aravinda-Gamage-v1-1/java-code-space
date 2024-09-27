class Main {
    public static void main(String[] args){
        int x = 20;
        int y = 10;
        int z;
        boolean statement;

        //Arithmetic operators
        z = x + y; //Addition
        z = x - y; //Subtraction
        z = x * y; //Multiplication
        z = x / y; //Division
        z = x % y; //Module
        z = ++x; //Increment
        z = --x; //Decrement

        //Assignment operators
        x = 10; //Assign
        x += 10; //Addition assign
        x -= 10; //Subtraction assign
        x *= 10; //Multiple assign
        x /= 10; //Division assign
        x %= 10; 
        x &= 10;
        x |= 3;
        x ^= 3;
        x >>= 3;
        x <<= 3;

        //Comparison operators
        statement = x == y; //Equal
        statement = x != y; //Not equal
        statement = x > y; //Greater than
        statement = x < y; //Less than
        statement = x >= y; //Grater than or equal
        statement = x <= y; //Less than or equal

        //Logical operators
        statement = x < y && y > x; //Logical and
        statement = x < y || y > x; //Logical or
        statement = !(x < y && y > x); //Logical not
    }
}
