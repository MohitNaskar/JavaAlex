public class SecondAndMinutes {
    public static String getDurationString(int seconds){
        int minutes = seconds/60;
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;

        return hours + "H" + remainingMinutes+"M" + remainingSeconds+"S";
    }
    public static String getDurationString(int minutes, int seconds){
         int minutesTotal = minutes + seconds/60;
         int hoursTotal = minutes / 60;
         int remainingMinutes = minutes % 60;
         int remainingSeconds = seconds % 60;
         return hoursTotal + "H" + remainingMinutes+"M" + remainingSeconds+"S";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }
}
