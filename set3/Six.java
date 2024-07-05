import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        // palindrome - skip the special characters like !@#$%^&*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find palindrome");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String input) {
        String regex = "[!@#$%^&*]";
        String finalStr = input.replaceAll(regex, "");
        int st = 0, end = finalStr.length() - 1;
        boolean status = true;
        while (st < end) {
            if (finalStr.charAt(st) != finalStr.charAt(end)) {
                status = false;
                break;
            }
            st++;
            end--;
        }
        return status;
    }
}

// m a l a y a l a m
