import java.util.Arrays;
import java.util.Scanner;
public class DigitTocharacter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number ");
        int n=in.nextInt();
        int i;
        int[] arr=new int[10];
        for( i=0;n>0;i++){
            int rem=n%10;
            arr[i]=rem;
            n=n/10;
        }
        //System.out.print(Arrays.toString(arr));
        for(int j=i-1;j>=0;j--){
            switch (arr[j]){
                case 0: System.out.println("zero");break;
                case 1: System.out.println("one");break;
                case 2: System.out.println("two");break;
                case 3: System.out.println("three");break;
                case 4: System.out.println("four");break;
                case 5: System.out.println("five");break;
                case 6: System.out.println("six");break;
                case 7: System.out.println("seven");break;
                case 8: System.out.println("eight");break;
                case 9: System.out.println("nine");break;
                default: System.out.println("invalid");break;
            }
        }

    }
}
