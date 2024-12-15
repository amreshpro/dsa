package pattern;

import java.util.Scanner;

public class Pattern4{
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //pattern 1
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j>=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }


        //pattern 2
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j>=i){
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        //pattern 3
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        System.out.println();
        //pattern 4
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j>=i){
                    System.out.print(n-i+1);
                }
            }
            System.out.println();
        }

    }

}