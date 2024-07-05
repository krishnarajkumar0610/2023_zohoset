import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int index = 0; index < arr.length; index++)
            arr[index] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int st = 0, end = arr.length - 1;
        while (st < end) {
            System.out.print(arr[end--] + " ");
            System.out.print(arr[st++] + " ");
        }
        System.out.print(arr[end]);
    }
}
