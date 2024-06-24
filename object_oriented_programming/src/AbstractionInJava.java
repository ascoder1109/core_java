public class AbstractionInJava {
    public static void main(String[] args) {
        Alto alto = new Alto();
        alto.accelerate();
        alto.brake();
    }
}

abstract class AbstractClassCar{
    String name = "Abstrat car";
    void accelerate(){
        System.out.println("Car accelerate");
    }
    void brake(){
        System.out.println("Car brake");
    }
}

class Alto extends AbstractClassCar{

}