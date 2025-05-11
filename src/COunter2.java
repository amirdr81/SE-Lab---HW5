import java.util.*;

public class Counter {
    public static void count() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10_000_000; i++)
            map.merge(i % 1000, 1, Integer::sum);
        System.out.println(map.size());
    }

    public static void main(String[] args) {
        count();
    }
}