public class REverserecursion {
    public static void main(String[] args) {
     //   re(10);
        printnum(1,10);

    }
    static void printnum(int start,int target){
        if(start==target){
            System.out.println(start);
            return;
        }
            System.out.println(start);
            printnum(start+1,target);
    }
    static void re(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
            System.out.println(n);
            re(n-1);
    }
}
