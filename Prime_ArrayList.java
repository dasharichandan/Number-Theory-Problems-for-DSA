import java.util.ArrayList;
import java.util.Scanner;

public class Prime_ArrayList {
    static ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> primes = primeRange(M, N);
        System.out.println("Prime numbers between " + M + " and " + N + ": " + primes);
        sc.close();
    }
    
}
