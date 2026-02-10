import java.util.*;

public class StreamCountTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        long count = list.stream()
                         .filter(x -> x > key)
                         .count();

        System.out.println(count);
    }
}
