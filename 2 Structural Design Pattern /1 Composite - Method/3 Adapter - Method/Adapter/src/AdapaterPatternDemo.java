public class AdapaterPatternDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        audioPlayer ap = new audioPlayer();
        ap.play("mp3","believer.mp3");
        ap.play("mp4","Om-Namah-Shivaay.mov");

    }
}