import java.util.Scanner;

public class RECURSINsumofnthnatural {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any one number ");
        int n=in.nextInt();
       // int result=sum(5);
        System.out.println(sum(n));

    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
}
