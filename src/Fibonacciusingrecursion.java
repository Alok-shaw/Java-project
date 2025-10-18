import java.util.Scanner;

public class Fibonacciusingrecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n number ");
        int n=in.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fibo(i));
        }

    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
