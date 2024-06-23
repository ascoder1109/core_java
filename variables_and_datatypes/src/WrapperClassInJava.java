public class WrapperClassInJava {
    public static void main(String[] args) {
        char ch = 'a';
        // Autoboxing: primitive -> Character object
        Character a = ch;
        System.out.println(a);
        Character b = ch;
        char c = b;
        //Unboxing: Character object -> primitive
        System.out.println(c);
    }
}
