public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Area area = new Area();
        area.shape(23);
        area.shape(23,32);
    }

}

class Area{
    void shape(int length, int width) {
        System.out.println(length*width);
    }
    void shape(int radius){
        System.out.println(3.14*radius*radius);
    }
}