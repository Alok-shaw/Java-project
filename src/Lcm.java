import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your two number for lcm ");
        int a = in.nextInt();
        int b = in.nextInt();
        int lcm = lcm(a, b);
        System.out.println("lcm is " + lcm);

    }

    static int lcm(int a, int b) {
        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return 0;
    }
}
