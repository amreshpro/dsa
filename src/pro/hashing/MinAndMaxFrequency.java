package pro.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MinAndMaxFrequency {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int minFreqCount = map.get(arr[0]);
        int min = 0;
        int max = 0;
        int maxFreqCount = map.get(arr[0]);
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > maxFreqCount) {
                maxFreqCount = map.get(arr[i]);
                max = i;
            }
            if (map.get(arr[i]) < minFreqCount) {
                minFreqCount = map.get(arr[i]);
                min = i;
            }
        }


        System.out.println("Max Frequent: " + arr[max] + " Min Frequent: " + arr[min]);
        System.out.println("Max Count: " + map.get(arr[max]) + ", Min Count: " + map.get(arr[min]));
    }


}
