package code;

//Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
//Output: true
//Explanation: The two events intersect starting from 01:20 to 02:00.

public class JavaCode {

    public static int strToTime(String str) {
        String[] parts = str.split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return hours * 60 + minutes;


    }

    public static void main(String[] args) {
//        ["10:00","11:00"]
//["14:00","15:00"]
        String[] event1 = {"10:00", "11:00"};
        String[] event2 = {"8:00", "9:00"};

        int startEvent1 = strToTime(event1[0]);
        int endEvent1 = strToTime(event1[1]);
        int startEvent2 = strToTime(event1[0]);
        int endEvent2 = strToTime(event1[1]);

        boolean isTimeConflict = (endEvent1 < startEvent2 && startEvent1 > endEvent2) ;

        System.out.println(isTimeConflict);




    }
}
