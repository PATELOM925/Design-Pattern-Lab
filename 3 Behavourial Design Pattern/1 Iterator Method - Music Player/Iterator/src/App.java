import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.addSong(new Song("Apna bana le", "Arijit"));
        player.addSong(new Song("Do din ki zindagi", "kabir cafe"));
        player.addSong(new Song("The nights", "Avicii"));

        Iterator<Song> iterator = player.getPlaylistIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.getTitle());
        }
    }
}





