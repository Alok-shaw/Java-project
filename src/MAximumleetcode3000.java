public class MAximumleetcode3000 {
    public static void main(String[] args) {
        int[][] a={{9,3},{8,6}};
        int re=ma(a);
        System.out.println(re);

        }
    static int ma(int[][] a){
        int m1= (int)Math.sqrt(a[0][0]*a[0][0]+a[0][1]*a[0][1]);
        int m2=(int) Math.sqrt(a[1][0]*a[1][0]+a[1][1]*a[1][1]);
        if(m1>m2){
            return a[0][0]*a[0][1];
        }
        else{
            return a[1][0]*a[1][1];
        }

    }
}
