### ArrayList
The ArrayList class is a resizable, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in java, is that the size of an array cannot be modified. While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different.
```
import java.util.ArrayList;
ArrayList<String> cars = new ArrayList<String>();
```
#### Add items
The ArrayList class have many useful methods. for example, to add elements to the list, use the add() method.
```
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

```
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

    System.out.println(cars);
  }
}
```
#### Access an item
To access an element in the ArrayList, use the get() method and refer to the index number.
``cars.get(0);``

#### Change an item
To modify an element, use the set() method and refer to the index number.
``cars.set(0, "Opel");``

#### Remove an item
To remove an element, use the remove() method and refer to the index number.
``cars.remove(0);``

To remove all the elements in the ArrayList, use the clear() method.
``cars.clear();``

#### ArrayList size
To find out how many elements an ArrayList have, use the size method.
``cars.size();``

#### Loop throught an ArrayList
Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run.
```
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```
You can also loop through an ArrayList with the for-each loop.
```
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
