

// AABBCCDD
// ABCDCCAD


import java.util.Scanner;

// ABB,BCD
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str 1 and str 2:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            findMismatch(str1, str2);
        } else {
            System.out.println("Mismatch length");
        }
    }

    public static void findMismatch(String str1, String str2) {
        StringBuilder str1Mismatch = new StringBuilder();
        StringBuilder str2Mismatch = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                str1Mismatch.append(str1.charAt(i));
                str2Mismatch.append(str2.charAt(i));
            }
        }
        System.out.println(str1Mismatch);
        System.out.println(str2Mismatch);
    }
}
