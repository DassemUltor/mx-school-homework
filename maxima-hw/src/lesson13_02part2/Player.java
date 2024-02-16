package lesson13_02part2;

public class Player {

    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;
    int stamina;


    Player() {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
            stamina = (int) (Math.random() * 11) + 90;
            System.out.println("Показатель выносливости нового игрока: " + stamina);
        } else {
            System.out.println("Команды уже собраны");
        }


    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок устал и покидает поле");
            countPlayers--;
            return;
        }
        System.out.println("Игрок бежит. Выносливость: " + stamina);
        stamina--;
    }

}
