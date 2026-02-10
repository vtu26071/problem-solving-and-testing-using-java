import java.util.*;

public class SumOfPowerDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, d);
            n /= 10;
        }

        System.out.println(sum);
    }
}
