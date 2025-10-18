public class Leetcode204 {
    public static void main(String[] args) {
        int result=countprime(100000);
        System.out.println("total prime number " +result);

    }
    static int countprime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
