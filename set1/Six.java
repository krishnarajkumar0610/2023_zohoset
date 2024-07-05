public class Six {
    public static void main(String[] args) {
        int row = 5;
        int range = 2;
        int st = 1;
        boolean isBounded = false;
        for (int i = 1; i <= row; i++) {
            range = i + 1;
            st = st + i - 1;
            int total = st;
            isBounded = false;
            System.out.print(total + "  ");
            for (int j = 1; j < row; j++) {
                if (range > 5) {
                    isBounded = true;
                }
                if (isBounded) {
                    total += --range;
                } else {
                    total += range++;
                }
                System.out.print(total + "  ");
            }
            System.out.println();
        }
    }
}
