public class Leetcode73 {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 9}, {4, 2, 6}, {1, 0,0}};
        int[][] arrr=zero(ar);
        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr.length; j++) {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] zero(int[][] arr) {
        int a[][] = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                a[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<a.length;k++){
                        a[i][k]=0;
                        a[k][j]=0;
                    }
                }
            }
        }
        return a;
    }
}