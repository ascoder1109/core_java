public class InterfaceInJava {
    public static void main(String[] args) {
        FootballPlayer fp = new FootballPlayer();
        fp.move();
    }
}

interface Player{
    final int id = 10;
    void move();
}

class FootballPlayer implements Player{
    int id = 7;

    @Override
    public void move() {
        System.out.println("Player is moving");
    }
}