### Encapsulation
The meaning of Encapsulation is to make sure that "sensitive data" hidden from users.
* Declare class variables/attributes as private.
* provide public getter and setter methods to access and update the value of a private variable.

```
public class car {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
```

#### Why encapsulation
* Better control of class variables and methods.
* Class variable can be made read only or write only.
* Flexible.
* Increased security of data.