public class ClassesAndObject {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.baking();
    }
}

class Cookie{
    String flavour;
    String color;
    int radius;
    void baking(){
        System.out.println("Baking has started!");
    }
}
