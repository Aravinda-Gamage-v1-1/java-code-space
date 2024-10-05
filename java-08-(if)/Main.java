class Main {
    public static void main(String[] args) {
        int x = 40;
        int y = 20;
        if (x > y) {
            System.out.println("Good people");
        } // if condition

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // if else condition

        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result); // Ternary operator

        int day = 10;
        if (day > 30) {
            System.out.println("End of the month");
        }else if (day > 20) {
            System.out.println("Mid of the month");
        }else {
            System.out.println("Start of the month");
        } // if else if conditions
    }
}
