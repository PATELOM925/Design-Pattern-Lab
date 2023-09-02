public class audioPlayer implements MediaPlayer{

    MediaAdapter ma;

    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing " + filename +" in mp3 format");
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            ma = new MediaAdapter(audioType);
            ma.play(audioType, filename);
        }
        else{
            System.out.println(filename+" has Invalid media format, ." + audioType + " not supported ");
        }
    }
}
