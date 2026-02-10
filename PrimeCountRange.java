import java.util.*;

public class PrimeCountRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i < 2) continue;
            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) count++;
        }

        System.out.println(count);
    }
}
