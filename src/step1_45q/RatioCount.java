package step1_45q;

import java.util.ArrayList;
import java.util.List;

public class RatioCount {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positiveCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;
        for(int i : arr){
            if(i>0){
                ++positiveCount;
            }else if(i<0){
                ++negativeCount;
            }else{
                ++zeroCount;
            }
        }

        System.out.printf("%.6f%n",(double)positiveCount / n);
        System.out.printf("%.6f%n",(double)negativeCount / n);
        System.out.printf("%.6f%n",(double)zeroCount / n);

    }

    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();

        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        plusMinus(arr);
    }
}
