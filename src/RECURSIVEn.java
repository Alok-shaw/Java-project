public class RECURSIVEn {
    public static void main(String[] args) {
        int s = num(1, 5);
        System.out.println(s);
    }

    static int num(int n, int a) {
        if (n == a) {
            return n;
        } else {
            return n+num(n + 1, a);
        }
    }
}
