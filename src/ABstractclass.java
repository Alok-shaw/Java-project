public class ABstractclass {
    public static void main(String[] args) {
        ba obj=new ba();
        obj.area();
        obj.abst();

    }
}
abstract class shape{
    abstract void area();
    final void abst(){
        System.out.println("this is final method ");
    }
}
abstract  class shap1{
    abstract void sam();
}
class ba extends shape{
    @Override
    void area() {
        System.out.println("child class");
    }
}



