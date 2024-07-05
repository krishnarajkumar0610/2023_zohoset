import java.util.*;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word:");
        String word = sc.nextLine().toLowerCase();
        word = word.replaceAll(" ", "");
        HashMap<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);
        for (char ch : word.toCharArray()) {
            if (vowels.containsKey(ch)) {
                vowels.put(ch, vowels.get(ch) + 1);
            }
        }
        for (char vowel : "aeiou".toCharArray()) {
            System.out.println(vowel + " : " + vowels.get(vowel));
        }
    }
}
