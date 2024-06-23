public class InheritanceInJava {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal = new Dog();
        animal.sound();
        System.out.println(animal.height);
    }

}
class Animal{
    String name = "Animal";
    String color = "Brown";
    int height = 10;
    void sound(){
        System.out.println("Animal making sound");
    }
}

class Dog extends Animal{
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("Bow Bow!");
    }
}


