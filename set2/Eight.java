import java.util.*;

public class Eight {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length - 1]);
        int maxElement = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                leaders.add(arr[i]);
            }
        }
        System.out.println(leaders);
    }
}
