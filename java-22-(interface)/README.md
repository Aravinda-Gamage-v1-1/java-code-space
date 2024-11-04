### Interface
Another way to achieve abstraction in java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
```
//interface
interface Animal{
    public void animalSound(); 
    public void run();
}
```

To access the interface methods, the interface must be "implement" by another class with the `implements` keyword.
```
interface Animal {
    public void animalSound();
    public void sleep();
}

class Pig implement Animal {
    public void animalSound(){
        System.out.println("wee weee");
    }

    public void sleep(){
        System.out.println("zzz");
    }
}

class Main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
```
