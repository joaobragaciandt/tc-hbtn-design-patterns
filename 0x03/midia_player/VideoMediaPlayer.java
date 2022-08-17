public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String Vlc) {
        System.out.print("Reproduzindo VLC: " + Vlc);
    }

    @Override
    public void reproduzirMp4(String MP4) {
        System.out.print("Reproduzindo MP4: " + MP4);
    }

}
