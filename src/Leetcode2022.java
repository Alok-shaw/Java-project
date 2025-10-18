public class Leetcode2022 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[][] arr1 = product(a, 1, 1);

        if (arr1.length == 0) {
            System.out.println("[]");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] product(int[] a, int m, int n) {
        if (a.length != m * n) {
            return new int[0][0];
        }

        int[][] arr = new int[m][n];
        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = a[k++];
            }
        }
        return arr;
    }
}
