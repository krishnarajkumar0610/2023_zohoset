public class One {
    public static void main(String[] args) {

        // 1
        // 2 6
        // 3 7 10
        // 4 8 11 13
        // 5 9 12 14 15
        int addingRange = 5;
        int row = 5;
        for (int i = 1; i <= row; i++) {
            int temp = i;
            addingRange = 4;
            System.out.print(temp + " ");
            for (int j = 1; j < i; j++) {                
                temp += addingRange;
                System.out.print(temp + " ");
                addingRange--;
            }
            System.out.println();
        }
    }
}
