public class RunTimePolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();
        parent = new Child();
        parent.method();
    }
}

class Parent{
    void method(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void method(){
        System.out.println("Child");
    }
}