import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        sumofDigits(num, 0);
    }

    public static void sumofDigits(int num, int result) {
        while (num != 0) {
            int rem = num % 10;
            result += rem;
            num /= 10;

        }
        if (result > 9) {
            num = result;
            sumofDigits(num, 0);
            return;
        }
        System.out.println(result);
    }
}