public class Four {
    public static void main(String[] args) {
        String input = "12345";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i == j || j == input.length() - i - 1) {
                    System.out.print(input.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
