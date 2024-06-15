public class SingletonClass {
    public static void main(String[] args) {
        MySingletonClass a = MySingletonClass.getInstance();
       MySingletonClass b = MySingletonClass.getInstance();
       a.x = a.x + 10;
       System.out.println("Value of a.x = " + a.x);
       System.out.println("Value of b.x = " + b.x);
    }
}

class MySingletonClass{
    static MySingletonClass instance = null;
    public int x = 10;
    private MySingletonClass(){}
    static public MySingletonClass getInstance(){
        if(instance == null){
            instance = new MySingletonClass();
        }
        return instance;
    }
}
