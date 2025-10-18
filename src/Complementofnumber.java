import java.util.Arrays;
import java.util.Scanner;

public class Complementofnumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your number ");
        int a=in.nextInt();
        String b1=Integer.toBinaryString(a);
        //   int num=Integer.parseInt(b1);
        char[] ch=b1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                ch[i]='0';
            }
            else{
                ch[i]='1';
            }
        }
        int sum=0,k=0;
        for(int i=ch.length-1;i>=0;i--){
           int bit=ch[i]-'0';
           sum=sum+bit*(int)Math.pow(2,k);
            k++;
        }
        System.out.println(sum);
    }
}
