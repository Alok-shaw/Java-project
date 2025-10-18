public class Leetcode633 {
    public static void main(String[] args) {
        int c=5;
        boolean re=sum(c);
        System.out.println(re);

    }
    static boolean sum(int c){
        int s;
        for(int i=1;i<=c;i++){
            s= (int)(Math.pow(i,2)+Math.pow(i+1,2));
            if(s==c){
                return true;
            }
        }
        return false;
    }
}
