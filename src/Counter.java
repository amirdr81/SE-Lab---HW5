import java.util.*;

public class Counter
{
    public static void count()
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10_000_000; i++)
        {
            if (map.containsKey(i % 1000)) map.put(i % 1000, map.get(i % 1000) + 1);
            else map.put(i % 1000, 1);
        }
        System.out.println(map.size());
    }

    public static void main(String[] args) {
        count();
    }
}