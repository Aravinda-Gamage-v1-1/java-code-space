class Main {
//    public static void main(String[] args) {
//        Vehicle vehi = new Vehicle();
//        vehi.vehicleSound();
//        vehi.tyreAmount();
//    }
}
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
Car extents Vehicle {
    public void vehicleSound(){
        System.out.println("burmmmm");
    }
}

