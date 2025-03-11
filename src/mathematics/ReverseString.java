package mathematics;

public class ReverseString {

    public static String reverseString(String str){
        char[] strArr = str.toCharArray();
        StringBuilder res= new StringBuilder();
        for (int i = strArr.length -1;  i>=0 ; i--) {
            res.append(strArr[i]);
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str = "Amresh";
        String res = reverseString( str);
        System.out.println(res);
    }
}
