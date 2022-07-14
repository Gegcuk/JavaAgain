package codewars.kyu5;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadableOptimized(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadableOptimized(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadableOptimized(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadableOptimized(86399));
        System.out.println(makeReadable(359999));
        System.out.println(makeReadableOptimized(359999));
    }

        public static String makeReadable(int seconds) {
            // Do something
            return String.format("%s:%s:%s", getHours(seconds), getMinutes(seconds), getSeconds(seconds));
        }

        public static String makeReadableOptimized(int seconds){
        return String.format("%02d:%02d:%02d", seconds/3600, (seconds/60) % 60, seconds%60);
        }

        private static String getSeconds(int seconds) {
            int second = seconds % 60;
            if(second < 10){
                return "0" + second;
            } else {
                return String.valueOf(second);
            }
        }

        private static String getMinutes(int seconds) {
            int minutes = seconds / 60 % 60;
            if(minutes < 10){
                return "0" + minutes;
            } else {
                return String.valueOf(minutes);
            }    }

        private static String getHours(int seconds) {
            int hours = seconds / (60 * 60);
            if(hours < 10){
                return "0" + hours;
            } else {
                return String.valueOf(hours);
            }
        }
}
