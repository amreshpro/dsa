package array;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i] + arr[j];
            }
        }
//        System.out.println("Sum: ", sum);
        System.out.println("Pair Sum: " + sum);


        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                sum2 += a[i] + b[j];
            }

        }

        System.out.println("Sum2 : " + sum2);
    }
}





