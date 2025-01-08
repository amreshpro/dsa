import java.util.Scanner;
import java.util.Vector;

public class PrimeFactorization {

    public static boolean isPrime(int n) {

        // only even prime
        if (n == 2 || n == 3 || n == 5)
            return true;
        // for faster check
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
            return false;

        for (int i = 7; i * i < n; i++) {
            if (n % i == 0)
                return false;

        }

        return true;
    }

    public static void factorsList(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.print(i + ", ");

        }
        System.out.println();
    }

    public static void primeFactorsList(int n) {
        Vector<Integer> vec = new Vector<>();
    
        // Remove all even prime factors
        while (n % 2 == 0) {
            vec.add(2);
            n /= 2;
        }
    
        // Remove all odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                vec.add(i);
                n /= i;
            }
        }
    
        // If n is still a prime number greater than 2, add it
        if (n > 2) {
            vec.add(n);
        }
    
        // Print the prime factors
        for (Integer i : vec) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        factorsList(n);
        boolean isPrimeNumber = isPrime(n);
        String str = isPrimeNumber ? "Prime" : "Not Prime";
        System.out.println(str);
        primeFactorsList(n);

    }

}