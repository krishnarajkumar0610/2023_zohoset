//Compare 2 equal length strings and find the mismatched pair of strings
//Input:
//str1 = "antonyandcleopatra"
//str2 = "antaniandcleapadra"


import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 and string 2:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            findMismatch(str1, str2);
        } else {
            System.out.println("Both are different length so can't find the mismatch");
        }
    }

    public static void findMismatch(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) + "," + str2.charAt(i));
            }
        }
    }
}


