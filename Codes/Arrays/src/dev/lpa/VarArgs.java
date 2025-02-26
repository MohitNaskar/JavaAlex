package dev.lpa;

public class VarArgs {
    public static void main(String[] args) {
        String[] splitStrings = "Hello World".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(20));
        String[] names ={"Mohit", "Abhishe", "Alex"};
        System.out.println(String.join(",",names));

    }

    private static void printText(String[] textList){
        for (String s : textList){
            System.out.println(s);
        }
    }
}
