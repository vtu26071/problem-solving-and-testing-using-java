import java.util.*;

public class UniqueDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] seen = new boolean[10];

        while (n > 0) {
            seen[n % 10] = true;
            n /= 10;
        }

        int count = 0;
        for (boolean b : seen)
            if (b) count++;

        System.out.println(count);
    }
}
