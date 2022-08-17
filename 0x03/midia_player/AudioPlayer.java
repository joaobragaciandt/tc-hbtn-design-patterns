public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia media, String nome) {
        if(media == TipoMedia.MP3) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(media);
            mediaPlayerAdapter.reproduzir(media,nome);
        }
    }
}
