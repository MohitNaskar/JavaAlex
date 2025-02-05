public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12, 31));
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    return true;
                } else if ((year % 400 == 0) && (year % 100 == 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        int output = 0;
        if (month < 1 || month > 12) {
            return -1;
        }
        else{
            if (year > 1 && year < 9999) {
                boolean isLeapYear = isLeapYear(year);
                if (isLeapYear) {
                    output = switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> 31;
                        case 4, 6, 9, 11 -> 30;
                        case 2 -> 29;
                        default -> -1;
                    };
                } else {
                    output = switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> 31;
                        case 4, 6, 9, 11 -> 30;
                        case 2 -> 28;
                        default -> -1;
                    };
                }
            }
            else {
                return -1;
            }
        }
        return output;
    }
}
