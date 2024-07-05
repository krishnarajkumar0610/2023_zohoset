import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int[] arr = new int[sc.nextInt()];
        int[] oddArr = new int[arr.length];
        int[] evenArr = new int[arr.length];
        int oddIndex = 0, evenIndex = 0;
        for (int index = 0; index < arr.length; index++)
            arr[index] = sc.nextInt();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 == 0)
                evenArr[evenIndex++] = arr[index];
            else if (arr[index] % 2 != 0)
                oddArr[oddIndex++] = arr[index];
        }
        oddArr = Arrays.copyOf(oddArr, oddIndex);
        evenArr = Arrays.copyOf(evenArr, evenIndex);
        
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }
}
