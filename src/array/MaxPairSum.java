package array;

public class MaxPairSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 5, 6, 7};
        int max_sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int currentSum = a[i] + b[j];
                max_sum = Math.max(max_sum, currentSum);
            }
        }
        System.out.println(max_sum);
    }
}
