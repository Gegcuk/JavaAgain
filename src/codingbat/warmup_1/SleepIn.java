package codingbat.warmup_1;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !(weekday && vacation);
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        sleepIn(true, false);
        sleepIn(false, true);
    }

}
