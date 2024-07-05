import java.util.*;

public class Seven {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 3, 4, 5 };
        int[] AB = new int[a.length + b.length];
        ArrayList<Integer> abUnion = new ArrayList<>();
        int[] abDuplicates = new int[AB.length];
        System.arraycopy(a, 0, AB, 0, a.length);
        System.arraycopy(b, 0, AB, a.length, b.length);
        for (int i = 0; i < AB.length; i++) {
            if (!checkIsDuplicateForUnion(AB[i], abDuplicates)) {
                abDuplicates[i] = AB[i];
                abUnion.add(AB[i]);
            }
        }
        System.out.println(abUnion);
    }

    static boolean checkIsDuplicateForUnion(int num, int[] duplicates) {
        for (int x : duplicates) {
            if (x == num)
                return true;
        }
        return false;
    }
}
