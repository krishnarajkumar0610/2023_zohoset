public class Three {
    public static void main(String[] args) {
        int binaryDigit = 100;

        convertToDeciaml(binaryDigit);
    }

    public static void convertToDeciaml(int binary) {
        int powNum = 0;
        int decimal = 0;
        while (binary != 0) {
            int rem = binary % 10;
            decimal = decimal + (rem * (int) Math.pow(2, powNum++));
            binary /= 10;
        }
        System.out.println(decimal);
    }
}
