public class Two {
    public static void main(String[] args) {
        printPattern("BASIC");
    }

    public static void printPattern(String word) {
        int mid = 0;
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            mid = word.length() / 2;
            index = 0;
            for (int j = 0; j < word.length() - i; j++) {
                index = j;
                System.out.print("  ");
            }
            while (index < word.length()) {
                if (mid >= word.length())
                    mid = 0;
                System.out.print(word.charAt(mid++) + " ");
                index++;
            }
            System.out.println();
        }
    }
}