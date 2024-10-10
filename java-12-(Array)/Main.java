class Main {
    public static void main(String[] args) {
        //Arrays
        String[] car = { "Volvo", "Toyota", "Jeep", "Hummer" };
        int[] num = { 10, 30, 40, 50 };

        System.out.println(car[1]);
        car[2] = "Opel";
        System.out.println(car[2]);
        System.out.println(num.length);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

        for (String i : car) {
            System.out.println(i);
        }

        //Multidimensional array
        int[][] numbers = {{10,20,30},{40,50,60}};

        System.out.println(numbers[1][0]); //output 40

        for (int i = 0; i < numbers.length; ++i){
            for (int j = 0; j < numbers[i].length; ++j){
                System.out.println(numbers[i][j]);
            }
        }

        for (int[] row : numbers){
            for (int i : row){
                System.out.println(i);
            }
        }
    }
}
