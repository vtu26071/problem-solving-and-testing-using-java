import java.util.*;
import java.util.stream.*;

public class StreamTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .forEach(System.out::println);
    }
}
