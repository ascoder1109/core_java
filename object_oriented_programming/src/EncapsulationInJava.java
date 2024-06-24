public class EncapsulationInJava {
    public static void main(String[] args) {
        SimpleGetterAndSetterClass obj = new SimpleGetterAndSetterClass();
        obj.setFirstName("Axle");
        obj.setLastName("Bob");
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
    }
}

class SimpleGetterAndSetterClass{
    private String firstName;
    private String lastName;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
