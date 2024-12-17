package step1_45q;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        int maxSum = 0;
        int minSum = 0;

        for(int i = 0; i<arr.size();i++){
            max = Math.max(arr.get(i),max);
            min = Math.min(arr.get(i), min);

        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) != min){
                maxSum += arr.get(i);
            }
            if(arr.get(i)!= max){
                minSum += arr.get(i);
            }

        }


        System.out.println(minSum+" "+maxSum);



    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        miniMaxSum(arr);


    }
}
