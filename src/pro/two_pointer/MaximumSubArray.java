package pro.two_pointer;


//Number of subarrays whose sum <= K
//        (All numbers in the array>=0)
//
//-> [2 1 1 5 8]
//K = 4


import java.util.Scanner;

public class MaximumSubArray {

    public static int maxSubArrayBelowK(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
              sum  += arr[j];
                if (sum  <= k) ++count;
            }
        }

        return  count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSubArrayCount = maxSubArrayBelowK(arr, n , 4);

        System.out.println(maxSubArrayCount);

        sc.close();
    }
}
