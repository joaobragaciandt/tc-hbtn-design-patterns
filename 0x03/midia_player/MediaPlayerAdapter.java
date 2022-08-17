public class MediaPlayerAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipo) {
        if(tipo != TipoMedia.MP3) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia media, String nome) {
        if(media == TipoMedia.MP4) {
            advancedMediaPlayer.reproduzirMp4(nome);
        }
        if(media == TipoMedia.VLC)
            advancedMediaPlayer.reproduzirVlc(nome);
    }
}
