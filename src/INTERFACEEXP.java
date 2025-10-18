public class INTERFACEEXP {
    public static void main(String[] args) {
        c obj=new c();
        obj.detail();
        obj.show();
        b.s();
    }
}
interface a{
    void show();
}
interface b{
    void detail();
     static void s(){
         System.out.println("static method");
    }
}
class c implements a,b{
    @Override
    public void show() {
        System.out.println("show method");
    }

    @Override
    public void detail() {
       System.out.println("detail method"); }
}