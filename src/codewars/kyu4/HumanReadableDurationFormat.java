package codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class HumanReadableDurationFormat {

    public static void main(String[] args) {
        System.out.println(formatDuration(3662));
        System.out.println(formatDuration(1));
        System.out.println(formatDuration(62));
        System.out.println(formatDuration(120));
        System.out.println(formatDuration(238));
        System.out.println(formatDuration(3600));
        System.out.println(formatDuration(360212150));

    }

    public static String formatDuration(int seconds) {
        List<String> resList = new ArrayList();
        if(!getYears(seconds).isBlank()) resList.add(getYears(seconds));
        if(!getDays(seconds).isBlank()) resList.add(getDays(seconds));
        if(!getHours(seconds).isBlank())resList.add(getHours(seconds));
        if(!getMinutes(seconds).isBlank())resList.add(getMinutes(seconds));
        if(!getSeconds(seconds).isBlank())resList.add(getSeconds(seconds));
        StringBuilder resString = new StringBuilder();
        if (seconds == 0){
            return "now";
        } else if(resList.size() == 1){
            return resList.get(0);
        } else {
            for(int i = 0; i < resList.size() - 1; i++){
                resString.append(resList.get(i));
                resString.append(", ");
            }
            resString.delete(resString.length()-2, resString.length());
            resString.append(" and ").append(resList.get(resList.size()-1));
            return resString.toString();
        }
    }


    private static String getSeconds(int seconds) {
        int second = seconds % 60;
        if(second == 0){
            return "";
        } else if (second == 1) {
            return "1 second";
        } else {
            return second + " seconds";
        }
    }

    private static String getMinutes(int seconds) {
        int minutes = seconds / 60 % 60;
        if(minutes == 0){
            return "";
        } else if (minutes == 1) {
            return "1 minute";
        } else {
            return minutes + " minutes";
        }
    }

    private static String getHours(int seconds) {
        int hours = seconds / (60 * 60) % 24;
        if(hours == 0){
            return "";
        } else if (hours == 1) {
            return "1 hour";
        } else {
            return hours + " hours";
        }
    }

    private static String getDays(int seconds) {
        int days = seconds / (60 * 60 * 24) % 365;
        if(days == 0){
            return "";
        } else if (days == 1) {
            return "1 day";
        } else {
            return days + " days";
        }
    }

    private static String getYears(int seconds) {
        int years = seconds / (60 * 60 * 24 * 365);
        if(years == 0){
            return "";
        } else if (years == 1) {
            return "1 year";
        } else {
            return years + " years";
        }
    }
}