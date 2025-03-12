package array;

public class SecondMaxInArray {

public static int secondMax(int[] arr){
    if(arr.length < 2 ){
          throw new IllegalArgumentException("Invalid input");
    }
    int secondMax = arr[0];
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max){
            secondMax = max ;
            max = arr[i];
        } else if (arr[i] !=max && arr[i] > secondMax) {
            secondMax = arr[i];

        }
    }

    return  secondMax;
}
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
     int res =   secondMax(arr);
        System.out.println(res);
    }
}
