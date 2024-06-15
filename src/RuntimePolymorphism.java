void main(){
    B b = new B();
    b.m1();
    C c = new C();
    c.m1();
}

class A{
    void m1(){
        System.out.println("A");
    }
}

class B extends A{
    void m1(){
        System.out.println("B");
    }
}

class C extends A{
    void m1(){
        super.m1();
    }
}