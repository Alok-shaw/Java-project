public class Leetcode233 {
    public static void main(String[] args) {
        int c=13;
        int re=count(18);
        System.out.println(re);

    }
    static int count(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            int num=i;
            while(num>0){
                int rem=num%10;
                if(rem==1){
                    c++;
                }
                num=num/10;

            }

        }
        return c;
    }
}
