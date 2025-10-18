public class Leetcode1 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
            while (b != 0) {
                int carry = (a & b) << 1;
                a = a ^ b;
                b = carry;
            }
        System.out.println(a);
            String str=String.valueOf(3);
    }
}
