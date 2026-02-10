import java.util.*;

interface Check {
    boolean test(int n);
}

public class LambdaTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Check isOdd = x -> x % 2 != 0;
        System.out.println(isOdd.test(n));
    }
}
