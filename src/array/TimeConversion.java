package array;

public class TimeConversion {

    public static String makeItTwoDigit(int number) {
        return (number < 10) ? "0" + Integer.toString(number) : Integer.toString(number);
    }

    public static String timeConversion(String s) {

        String[] parts = s.split(":");
        Integer hour = Integer.valueOf(parts[0]);
        Integer minutes = Integer.valueOf(parts[1]);
        Integer lastSecond = Integer.valueOf(parts[2].substring(0, 2));
        boolean isAM = parts[2].charAt(2) == 'A' ? true : false;
        if (isAM && hour == 12) {
            hour = 0; // Midnight case
        } else if (!isAM && hour != 12) {
            hour += 12; // Afternoon case
        }

        if (Integer.valueOf(lastSecond) >= 60) {
            lastSecond = lastSecond - 60;
            ++minutes;

        }
        if (minutes >= 60) {
            minutes = minutes - 60;
            ++hour;
        }

        String result = makeItTwoDigit(hour) + ":" + makeItTwoDigit(minutes) + ":" + makeItTwoDigit(lastSecond);

        return result;
    }

    public static void main(String[] args) {

        timeConversion("12:05:45AM");
    }

}
