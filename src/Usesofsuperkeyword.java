public class Usesofsuperkeyword {
    public static void main(String[] args) {
        base11 obj=new base11();
        obj.detail();
    }
}
class super11{
    super11(){
        System.out.println("parent class constructor ");
    }
    void detail(){
        System.out.println("parent class method ");

    }
}
class base11 extends super11{
    @Override
    void detail() {
        System.out.println("child class method ");
        super.detail();
    }

}
