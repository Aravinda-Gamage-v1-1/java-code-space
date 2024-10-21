class Main {
    int x = 5;
    
    public static void main(String[] args) {
        Main myObj1 = new Main();
        System.out.println(myObj1.x);

        Main myObj2 = new Main();
        System.out.println(myObj2.x);

        printStatic();

        Second myObjSecond = new Second();
        myObjSecond.print();
        System.out.println(myObjSecond.massage);
    }
}
