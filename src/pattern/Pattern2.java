package pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //pattern 1
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print((char) (a + i));
            }
            System.out.println();
        }

        //pattern 2
        System.out.println("Enter row for pattern 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(i + 1);
                } else {

                }
            }
            System.out.println();
        }

    }

}
