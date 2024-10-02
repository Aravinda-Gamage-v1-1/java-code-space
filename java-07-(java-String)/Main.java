class Main {
    public static void main(String[] args){
        String greeting = "Hello";
        System.out.println(greeting );
        System.out.println(greeting.length());

        String fName = "Aravinda";
        String lName = "Gamage";
        System.out.println(fName + " " + lName);

        System.out.println(fName.concat(" ").concat(lName));

        String text01 = "Hello I\'m Aravinda";
        String text02 = "Hello This is \"Amaya\"";
        String text03 = "Anura\\Kumara\\Disanayaka";
        String text04 = "Healthy eating is crucial for maintaining overall well-being and preventing chronic diseases. A balanced diet provides essential nutrients that the body needs to function correctly, including vitamins\n, minerals, protein, and healthy fats. Consuming a variety of fruits,\b vegetables, whole grains, and lean proteins\t can boost the immune system, improve mental health, and increase energy levels. Additionally, healthy eating habits can help manage weight and reduce the risk of conditions such as heart disease, diabetes, and obesity. By making mindful food choices, individuals can enhance their quality of life and promote long-term health.";
        System.out.println(text04);
    }
}
