### Enum
An enum is a special "class" that represents a group of constants (unchangeable variable, like `final` variables).
To create an enum, use the enum keyword, and separate the constants with a comma. Note that they should be in uppercase letters.
```
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

#### Enum inside a class
You can have an enum inside a class.
```
public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
```