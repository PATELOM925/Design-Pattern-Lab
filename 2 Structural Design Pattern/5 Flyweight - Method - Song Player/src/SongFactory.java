import java.util.HashMap;
import java.util.Map;

public class SongFactory {
    private static Map<String, Song> songMap = new HashMap<>();

    public static Song getSong(String artistName, String albumName, String genre, int duration) {
        String key = artistName + albumName + genre;
        Song song = songMap.get(key);

        if (song == null) {
            song = new Song(artistName, albumName, genre, duration);
            songMap.put(key, song);
        }

        return song;
    }
}