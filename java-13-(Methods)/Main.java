class Main {
    public static void main(String[] args) {
        print();
        fName("Aravinda");
        System.out.println(lName());
        print();
        fName("Yasith");
        System.out.println(lName());
        print();
        fName("Gayanuka");
        System.out.println(lName());

        name();
        name("Aravinda");
        name("Aravinda", "Sumudu");

        int result = sum(5);
        System.out.println(result);
    }

    static void print(){
        System.out.print("Hello ");
    }

    static void fName(String name){
        System.out.print(name);
    }

    static String lName(){
        return " Gamage";
    }

    static void name(){
        System.out.println("Hello");
    }

    static void name(String fName){
        System.out.println("Hello " + fName);
    }

    static void name(String fName, String lName){
        System.out.println("Hello " + fName + " " + lName);
    }

    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }
}
