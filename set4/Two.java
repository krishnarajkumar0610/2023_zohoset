import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row = sc.nextInt();
        printPattern(row);
    }

    public static void printPattern(int row) {
        for (int i = row; i >= 1; i--) {
            int temp = 0;
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
                temp = j;
            }
            for (int j = 1; j <= row - temp; j++) {
                System.out.print("+ ");
            }
            int num = 1;
            while (num < row - temp) {
                System.out.print("+ ");
                num++;
            }
            System.out.println();
        }
    }
}
