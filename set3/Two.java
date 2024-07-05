import java.util.HashSet;

public class Two {
    public static void main(String[] args) {
        String input = "AAABBC";
        compress(input);
    }

    public static void compress(String input) {
        StringBuilder compressedStr = new StringBuilder();
        HashSet<Character> duplicates = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int count = 1;
            if (duplicates.contains(letter)) {
                continue;
            }
            duplicates.add(letter);
            compressedStr.append(letter);
            for (int j = i + 1; j < input.length(); j++) {
                if (letter == input.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            compressedStr.append(count);
        }
        System.out.println(compressedStr);
    }
}
