import java.util.*;

public class SumNonPrimeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i))
                sum += arr[i];
        }

        System.out.println(sum);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
