package step1_45q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiaginalDiffernce {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primarySum = 0;
        int secondarySum = 0;

        for(int i = 0; i < arr.size(); i++){

            int n = arr.size();
            for (int j = 0; j < n; j++) {
                primarySum += arr.get(i).get(i);
                secondarySum += arr.get(i).get(n - 1 -i);
            }

        }
        System.out.println(primarySum);
        System.out.println(secondarySum);
        return Math.abs(primarySum - secondarySum);

    }


    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>( Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        )) ;
        System.out.println(diagonalDifference(arr));
    }

}
