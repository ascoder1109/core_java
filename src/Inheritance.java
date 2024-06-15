void main(){
    Dog dog = new Dog();
    dog.printDetails();
}

class Animal{
    String breed = "Animal Breed";
    String color = "Brown";
    int height = 4;
    void printDetails(){
        System.out.println(STR."Breed : \{breed}, color : \{color}, height : \{height}");
    }
}

class Dog extends Animal{
    String breed = "German Shephard";
    String color = "White";
    void printDetails(){
        super.printDetails();
    }
}