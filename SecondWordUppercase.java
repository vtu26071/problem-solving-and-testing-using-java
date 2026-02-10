import java.util.*;

public class SecondWordUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        if (words.length >= 2)
            System.out.println(words[1].toUpperCase());
    }
}
