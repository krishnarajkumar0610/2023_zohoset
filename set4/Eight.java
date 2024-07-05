public class Eight {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tree";
        concatenate(str1, new StringBuilder(str2));
    }

    public static void concatenate(String str1, StringBuilder str2) {
        String finalStr = "";
        if (str1.charAt(str1.length() - 1) != str2.charAt(0)) {
            finalStr = str1 + str2;
        }else{
            finalStr = str1 + str2.deleteCharAt(0);
        }
        System.out.println(finalStr);
    }
}
