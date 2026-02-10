import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
