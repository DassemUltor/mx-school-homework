package lesson21_02.task_2;

public class Main {

    public static void main(String[] args) {

        VideoPlayer player = new VideoPlayer();
        WrapPlayer wrapPlayer = new WrapPlayer(player);
        wrapPlayer.play();
    }
}
