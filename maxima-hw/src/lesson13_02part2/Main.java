package lesson13_02part2;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        Player.info();

        for (int i = 0; i < 101; i++) {
            player1.run();
        }


    }
}
