import java.util.*;

public class Four {
    public static void main(String[] args) {
        String str = "12345*+-+";
        calculateTotal(str.toCharArray());
    }

    public static void calculateTotal(char[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                numbers.add(Character.getNumericValue(arr[i]));
            } else {
                operators.add(arr[i]);
            }
        }
        int numIndex = 0, oprIndex = 0;
        int[] nums = new int[numbers.size()];
        char[] opr = new char[operators.size()];
        while (numIndex < nums.length) {
            nums[numIndex] = numbers.get(numIndex);
            numIndex++;
        }
        while (oprIndex < opr.length) {
            opr[oprIndex] = operators.get(oprIndex);
            oprIndex++;
        }
        numIndex = 1;
        oprIndex = 0;
        int res = 1;
        while (numIndex < nums.length && oprIndex < opr.length) {
            if (opr[oprIndex] == '+') {
                res = res + nums[numIndex];
            } else if (opr[oprIndex] == '-') {
                res = res - nums[numIndex];
            } else if (opr[oprIndex] == '*') {
                res = res * nums[numIndex];
            }
            numIndex++;
            oprIndex++;
        }
        System.out.println(res);
    }
}
