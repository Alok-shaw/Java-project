public class Practise {
    public static void main(String[] args) {
        int[] a={3,30,34,5,9};
        s(a);
       // su(11);

    }
    static void su(int a[]){
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
        }

    }
    static String s(int[] a){
        String sum="";
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
//        String str=String.valueOf(sum);
//        System.out.println(str);
        char[] ch=sum.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char c=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=c;
        }
        String str=String.valueOf(ch);
        System.out.println(str);
        return str;
    }
}
