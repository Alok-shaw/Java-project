public class Leetcode67 {
    public static void main(String[] args) {
        String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String  re=binary(a,b);
        System.out.println(re);

    }
    static String binary(String a,String b){
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        int an=0,bn=0;
        int k=0,j=0;
        for(int i=a1.length-1;i>=0;i--){
            int bits=a1[i]-'0';
            an=an+bits*(int)Math.pow(2,k);
            k++;
        }
        System.out.println(an);
        for(int i=b1.length-1;i>=0;i--){
            int bits=b1[i]-'0';
            bn=bn+bits*(int)Math.pow(2,j);
            j++;
        }
        System.out.println(bn);
        int re=an+bn;
        String res=Integer.toBinaryString(re);
        return res;
    }
}
