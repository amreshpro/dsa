package mathematics;

public class ReverseInteger {

    public  static int[] reverseInteger(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] res = reverseInteger(arr);
        for(int i : res){
          System.out.print(i+", ");
      }
    }
}
