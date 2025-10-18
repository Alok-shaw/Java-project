public class Leetcode678 {
    public static void main(String[] args) {
        boolean val = validparenthesis("))");
        System.out.println(val);

    }

    static boolean validparenthesis(String s) {
        char[] ch = s.toCharArray();
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' && ch[ch.length - 1 - i] == ')') {
                c++;
            }
            if (ch[i] == '*') {
                c++;
            }
        }
        if(c==0){
            return false;
        }
        else {
            return true;
        }
    }
}
