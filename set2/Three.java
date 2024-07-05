import java.util.*;

public class Three {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 8, 4, 3, 0 };
        int[] tempArr = Arrays.copyOfRange(arr, 0, arr.length);
        int[] indexes = new int[arr.length];
        Arrays.sort(tempArr);
        for (int index = 0; index < arr.length; index++)
            indexes[index] = checkItContains(tempArr[index], arr);
        System.out.println(Arrays.toString(indexes));
    }

    static int checkItContains(int num, int[] arr) {
        int position = 0;
        for (int index = 0; index < arr.length; index++) {
            if (num == arr[index]) {
                position = index;
                break;
            }
        }
        return position;
    }
}