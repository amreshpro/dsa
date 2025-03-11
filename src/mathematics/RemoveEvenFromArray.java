package mathematics;

public class RemoveEvenFromArray {

    public  static  int[] removeEvenArray(int[] arr){
        int oddCount = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if((arr[i] & 1) != 0){
                ++oddCount;
            }
        }


        int[] res = new int[oddCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if((arr[i] & 1) != 0){
                res[index] = arr[i];
                ++index;
            }
        }

        return  res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
      int[] ans =  removeEvenArray(arr);
      for (int i : ans){
          System.out.print(i+" ");
      }
    }
}
