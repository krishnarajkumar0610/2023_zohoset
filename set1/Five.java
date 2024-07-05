public class Five {
    public static void main(String[] args) {
        int row = 5;
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            num = i;
            for (int j = 1; j <= row; j++) {
                if (num > 5)
                    num = 1;
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
