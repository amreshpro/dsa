package pro.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Sieve {
    public static int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        int count = 0;
        ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n, true));
        for (int i = 2; i < n; i++) {
            if (isPrime.get(i)) {
                count++;
                System.out.print(i+", ");
                for (int j = i * 2; j < n; j += i) {
                    isPrime.set(j, false);
                }
            }
        }


        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int result = countPrimes(n);
        System.out.println("Count: " + result);
    }
}
