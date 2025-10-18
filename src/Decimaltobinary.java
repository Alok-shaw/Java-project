public class Decimaltobinary {
    public static void main(String[] args) {
         int r=binarybase(12);
        System.out.println(r);

    }
    static int  binarybase(int n){
        StringBuilder obj=new StringBuilder();
        while(n>0){
            if(n%2==0){
                obj.append(0);
            }
            else{
                obj.append(1);
            }
            n=n/2;
        }
        String re=obj.reverse().toString();
        char[] ch=re.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char c=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=c;
        }
        String re1=String.copyValueOf(ch);
        int decimal=0;
        int power=0;
        for (int i =re1.length() - 1; i >= 0; i--) {
            int bit = re1.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}
