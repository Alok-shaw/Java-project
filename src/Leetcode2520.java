public class Leetcode2520 {
    public static void main(String[] args) {
        int re=count(123);
        System.out.println(re);

    }
    static int count(int a){
        int c=0;
        int or=a;
        while(a>0){
            int rem=a%10;
            if(or%rem==0){
                c++;
            }
            a=a/10;
        }
        return c;
    }
}
