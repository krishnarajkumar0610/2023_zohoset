import java.util.Scanner;

public class Fou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number:");
            int num = sc.nextInt();
            findCoolOrNot(num);
        }

    }

    public static void findCoolOrNot(int num) {
        String numStr = Integer.toString(num);
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            char chValue = numStr.charAt(i);
            int n = Character.getNumericValue(chValue);
            if (i % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        System.out.println("Even sum :" + evenSum);
        System.out.println("Odd sum :" + oddSum);
        if (oddSum == evenSum) {
            System.out.println("Number is cool");
        } else {
            System.out.println("Number is not cool");
        }
    }
}