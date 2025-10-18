import java.util.Arrays;

class Solutions {
    public static void main(String[] args) {
        String[] str = {"alok", "snade", "alok"};
        String sr =longestCommonPrefix(str);
        System.out.println(sr);
    }
   static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = Math.min(first.length(), last.length());
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                prefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}
