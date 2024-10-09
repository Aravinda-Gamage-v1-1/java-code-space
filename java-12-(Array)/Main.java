class Main {
    public static void main(String[] args) {
        String[] car = {"Volvo", "Toyota", "Jeep", "Hummer"};
        int[] num = {10, 30, 40, 50};

        System.out.println(car[1]);
        car[2] = "Opel";
        System.out.println(car[2]);
        System.out.println(num.length);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

        for (String i : car){
            System.out.println(i);
        }
    }
}
