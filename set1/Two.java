public class Two {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            int temp = 1;
            for (int j = row; j >= i; j--) {
                System.out.print("  ");
                temp = j;
            }
            for (int k = temp; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
