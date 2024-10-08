class Main {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("This is a for loop " + i);
        }

        for(int i = 0; i < 5; i++){
            System.out.println("This is a nested outer loop " + i);
            for(int x = 0; x < 5; x++){
                System.out.println("This is a nested inner loop " + x);
            }
        }

        String[] cars = {"Hammer", "Toyota", "Hyundai"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}
