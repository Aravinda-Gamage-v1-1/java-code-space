### Abstraction
Data abstraction is the process of hiding certain details and showing only essential information to the user. Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is non-access modifier, used for classes and methods.
* Abstract class: is restricted class that cannot be used ot cerate objects (to access it, it must be inherited form another class).
* Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
```
abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzz");
    }
}
```

To access the abstract class, it must be inherited from another class. 
```
//Abstract class
abstract class Vehicle {
    //Abstract method
    public abstract void vehicleSound();
    //Regular method
    public void tyreAmount(){
        System.out.println(4);
    }
}

//Subclass 
public Car extents Vehicle {
    public void vehicleSound(){
        System.out.println("burmmmm");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehi = new Vehicle();
        vehi.vehicleSound();
        vehi.tyreAmount();
    }
}
```