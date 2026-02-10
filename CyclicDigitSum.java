import java.util.*;

public class CyclicDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for (char c : s.toCharArray())
            sum += c - '0';

        System.out.println(sum);
    }
}
