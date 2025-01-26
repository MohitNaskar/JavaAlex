public class ToCentimeters {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6,2));
        System.out.println(convertToCentimeters(6));
    }
    public static double convertToCentimeters(int inch) {
        return inch * 2.54;
    }
    public static double convertToCentimeters(int feet, int inch) {
        return ((feet * 12 + inch) * 2.54);
    }
}
