package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //pattern 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(0);
            }
            System.out.println();
        }

        //pattern 2
        System.out.println("Enter row for pattern 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(0);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
