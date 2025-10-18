import java.util.*;
public class POWtwoleetcode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number ");
        int n=in.nextInt();
        boolean re=pow(n);
        System.out.println(re);

    }
    static boolean pow(int n){
        for(int i=0;i<=n/2;i++){
            if((int) Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}
