package lesson21_02.task_2;

interface MediaPlayer {
    void play();
}

public class VideoPlayer {
    void playAvi() {
        System.out.println("player is playing avi format");
    }
}

class WrapPlayer implements MediaPlayer {
    VideoPlayer player;

    public WrapPlayer(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playAvi();
    }
}


