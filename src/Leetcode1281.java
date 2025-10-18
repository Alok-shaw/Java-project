public class Leetcode1281 {
    public static void main(String[] args) {
        int c=1234;
        int re=productadd(c);
        System.out.println(re);

    }
    static int  productadd(int c){
        int p=1;
        int s=0;
        while(c>0){
            int rem=c%10;
            p=p*rem;
            s=s+rem;
            c=c/10;
        }
        int sub=p-s;
        return sub;
    }
}
