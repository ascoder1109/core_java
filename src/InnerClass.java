void main(){
    Outer outer = new Outer();
    outer.show();
    Outer.Inner inner = new Outer().new Inner();
    inner.show();
}

class Outer{
    class Inner{
        void show(){
            System.out.println("Inner show");
        }
    }
    void show(){
        System.out.println("Outer show");
    }
}