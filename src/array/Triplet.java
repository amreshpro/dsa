package array;

public class Triplet {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
//                   sum % 2 == 0 ? ++evenCount : ++oddCount;
                    if (sum % 2 == 0) {
                        ++evenCount;
                    } else {
                        ++oddCount;
                    }
                    System.out.println(sum);
                }
            }
        }
        System.out.println("oddCount: " + oddCount);
        System.out.println("evenCount: " + evenCount);
    }
}
