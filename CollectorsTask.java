import java.util.*;
import java.util.stream.*;

public class CollectorsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Map<String, List<Integer>> result =
                list.stream().collect(
                        Collectors.groupingBy(
                                x -> (x % 2 == 0) ? "Even" : "Odd"
                        )
                );

        System.out.println(result);
    }
}
