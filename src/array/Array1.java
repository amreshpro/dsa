package array;

public class Array1 {
    public static int[] reverse(int... arr) {

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = reverse(arr);
        for (int i : res) {
            System.out.print(i + ", ");
        }
    }
}
