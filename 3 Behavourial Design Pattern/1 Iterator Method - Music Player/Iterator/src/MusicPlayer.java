import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MusicPlayer {
    private List<Song> playlist;

    public MusicPlayer() {
        playlist = new ArrayList<>();
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public Iterator<Song> getPlaylistIterator() {
        return new PlaylistIterator(playlist);
    }
}
    