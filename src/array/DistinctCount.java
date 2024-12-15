package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DistinctCount {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 3};
        boolean[] hash = new boolean[101];
        Arrays.fill(hash, false);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (hash[arr[i]] == false) {
                ++count;
                hash[arr[i]] = true;
            }
        }
        System.out.println("Distinct Count: " + count);
    }
}
