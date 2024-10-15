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
}
