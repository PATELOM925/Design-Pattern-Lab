public class Song {
    private String artistName;
    private String albumName;
    private String genre;
    private int duration;

    public Song(String artistName, String albumName, String genre, int duration) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + this.artistName + "'s song " + this.albumName);
    }
}