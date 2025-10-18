import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Rotatearraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rotation of your array :");
        int k=in.nextInt();
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
//        obj.add(6);
//        obj.add(7);
//        obj.add(8);
//        obj.add(9);
//        obj.add(10);

        int[] arr = new int[obj.size()];  // create primitive array

        for (int i = 0; i < obj.size(); i++) {
            arr[i] = obj.get(i);  // unboxing each Integer to int
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<k;i++) {
            int f=arr[arr.length-1];
            for (int j= arr.length-1;j>0; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=f;
        }
        System.out.println(Arrays.toString(arr));

    }
}
