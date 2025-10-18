import java.util.Scanner;
public class PAlidromeforleetcode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter any number ");
        int n=in.nextInt();
        int org=n;
        int num=0;
        //System.out.println(n);
        if(n<0){
            System.out.println("no");
        }
        while(n>0){
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        if(num==org){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
//    public boolean isPalindrome(int x) {
//        // Negative numbers are not palindromes
//        if (x < 0) return false;
//
//        String s = String.valueOf(x);
//        int left = 0, right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;1
}
