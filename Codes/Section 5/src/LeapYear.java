public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year > 1 && year <= 9999) {
            if ( year % 4 == 0) {
                if ( year % 100 != 0) {
                    return true;
                }
                else if( (year % 400 == 0) && (year % 100 == 0)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}