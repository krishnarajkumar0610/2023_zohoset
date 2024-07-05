import java.util.*;
import java.util.Map.Entry;

public class Nine {
    public static void main(String[] args) {
        int[] numbers = { 8, 15, 25, 36, 42 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        findFactors(numbers);
    }

    public static void findFactors(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0)
                    count++;
            }
            map.put(numbers[i], count);
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
        }
    }
}
