import java.util.Arrays;

public class Leetcode190 {
    public static void main(String[] args) {
        bits(5);

    }

    static int bits(int n) {
        String binary32 = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] ch=binary32.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        String reversedBinary = new String(ch);
        long sum = Long.parseLong(reversedBinary, 2);
        System.out.println(sum);

        return 0;
    }
}
