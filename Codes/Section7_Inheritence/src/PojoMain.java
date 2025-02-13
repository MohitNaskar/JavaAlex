public class PojoMain {
    public static void main(String[] args) {
        for (int i = 1; i<=5 ;i ++){
            PojoClass s = new PojoClass("SDG74" + i,
                    switch (i){
                        case 1 -> "Mohit";
                        case 2 -> "ABHI";
                        case 3 -> "Abee";
                        case 4 -> "Avvi";
                        case 5 -> "Avi";
                        default -> "Aby";
                    },"05/11/1985",
                    "Java");
            System.out.println(s);

        }
    }
}
