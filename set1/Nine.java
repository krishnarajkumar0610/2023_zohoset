public class Nine {
    public static void main(String[] args) {
        int row = 5;
        int length = 1;
        for (int i = row; i >= 1; i--) {
            int num = 4;
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
                num--;
            }
            for (int k = num; k >= 0; k--) {
                System.out.print(k + " ");
            }
            for (int j = 1; j < length; j++) {
                System.out.print(j + " ");
            }
            length += 1;
            System.out.println();
        }
    }
}
