public class Duration {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int new_minutes = minutes % 60;
            return hours + "h " + new_minutes + "m " + seconds + "s";
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int new_seconds = seconds % 60;

            return getDurationString(minutes, new_seconds);
        } else {
            return "Invalid value";
        }
    }
}
