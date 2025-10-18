import java.util.Scanner;

public class Euclideangcd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your two number for gcd :");
        System.out.println("enter your first number ");
        int a=in.nextInt();
        System.out.println("enter you second number ");
        int b=in.nextInt();
        int re=gcd(a,b);
        System.out.println(re);

    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            int rem=a%b;
            return gcd(b,rem);
        }
    }
}
