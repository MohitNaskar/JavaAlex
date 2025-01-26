public class SpeedConverter {
    public static long toMilesPerHour(double  kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            double number = kilometersPerHour/1.609;
            return Math.round(number);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0) {
            System.out.println("Invalid value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
}
