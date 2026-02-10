import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++)
            names[i] = sc.nextLine();

        for (int i = 0; i < n; i++)
            heights[i] = sc.nextInt();

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++)
            idx[i] = i;

        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        for (int i = 0; i < n; i++)
            System.out.println(names[idx[i]]);
    }
}
