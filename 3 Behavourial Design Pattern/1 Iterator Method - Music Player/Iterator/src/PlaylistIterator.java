import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PlaylistIterator implements Iterator<Song> {
    private List<Song> playlist;
    private int currentIndex;

    public PlaylistIterator(List<Song> playlist) {
        this.playlist = playlist;
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < playlist.size();
    }

    public Song next() {
        Song song = playlist.get(currentIndex);
        currentIndex++;
        return song;
    }
}
