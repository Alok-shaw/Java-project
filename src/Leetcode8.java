public class Leetcode8 {
    public static void main(String[] args) {
        int re=myatoi("-42alok");
        System.out.println(re);
    }
    static int myatoi(String s){
        String s1=s.trim();
        char[] ch=s1.toCharArray();
        int a=0;
        String str="";
        for(int i=0;i<ch.length;i++){
            if ((ch[i] >= '0' && ch[i] <= '9') || (i == 0 && (ch[i] == '-' || ch[i] == '+'))) {
                str = str + ch[i];
            } else {
                break;
            }
//            if(ch[i]!='1' && ch[i]!='2' && ch[i]!='3' &&ch[i]!='4' && ch[i]!='5' && ch[i]!='6' && ch[i]!='7' && ch[i]!='8' &&ch[i]!='9'){
//                break;
//            }
        }
        if(str.isEmpty()){
            return 0;
        }
        a = Integer.parseInt(str);
        return a;
    }
}
