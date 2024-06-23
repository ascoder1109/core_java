public class ConstructorsInJava {
    public static void main(String[] args) {
        Car car = new Car("Toyota",1200000);
        car.printName();
        car.printPrice();
    }
}

class Car{
    String name;
    int price;
    Car(String name, int price){
        this.name = name;
        this.price = price;
    }

    void printName(){
        System.out.println(name);
    }
    void printPrice(){
        System.out.println(price);
    }
}
