public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Area area = new Area(4 , 7 );
        area = new Area(4,7,8);

    }
}

class Area{
    Area(int a, int b){
        System.out.println(a*b);
    }
    Area(int a, int b, int c){
        System.out.println(a*b*c);
    }
}
