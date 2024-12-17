package step1_45q;

import java.util.Scanner;

public class Pattern1 {
 static   Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n;
       // n = sc.nextInt();
        n = 4;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (j>= n-i-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
