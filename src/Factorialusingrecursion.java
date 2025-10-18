import java.util.Scanner;

public class Factorialusingrecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number ");
        int n=sc.nextInt();
        System.out.println(fac(n));

    }
    static int fac(int n){
        if(n==1){
            return n;
        }
        else{
            return n*fac(n-1);
        }
    }
}
