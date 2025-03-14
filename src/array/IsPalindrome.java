package array;

public class IsPalindrome {

public static boolean isPalindrome(String str ){
    char[] charStr = str.toCharArray();
    if(charStr.length == 0 ) return  true;
    int start = 0;
    int end = charStr.length -1;
    while (start <= end){
        if(charStr[start] != charStr[end]){
            return false;
        }
        start++;
        end--;
    }

    return true;
}
    public static void main(String[] args) {
        String str = "lali";
        System.out.println(isPalindrome(str));
    }
}
