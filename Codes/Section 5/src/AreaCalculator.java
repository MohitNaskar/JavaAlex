public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-10,2));
    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return 3.14159265359 *(radius*radius);

    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

}
