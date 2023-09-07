public class MusicApp {
    public static void main(String[] args) {
        Song s1 = SongFactory.getSong("KabirCafe", "2 din", "doha", 503);
        Song s2 = SongFactory.getSong("Mukesh", "Main Pal Do Pal Ka Shair", "light", 160);
        s1.play();
        s2.play(); } }