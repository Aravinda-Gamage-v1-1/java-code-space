

import java.util.LinkedList;

class Main27 {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Micro");
        cars.add("GMC");
        System.out.println(cars);
        cars.add(2,"Nissan");
        System.out.println(cars);
    }
}
