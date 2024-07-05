public class Three {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            if (i > 3) {
                total = i + 2;
            } else {
                total = i;
            }
            int temp = total;
            System.out.print(temp + " ");

            for (int j = 1; j < i; j++) {
                temp += 2;
                System.out.print(temp + " ");

            }
            System.out.println();
        }
    }
}