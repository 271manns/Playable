import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MediaPlayer{
    public static void main(String[] args) {
        Playable song = new Song("Shape of You", "Ed Sheeran");
        Playable video = new Video();

        song.play();
        song.stop();

        video.play();
        video.stop();
        Playable[] playlist = new Playable[2];
        for(Playable p : playlist){
            p.play();
            p.stop();

        }
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Playable> list3 = new Stack<>();
    }
}