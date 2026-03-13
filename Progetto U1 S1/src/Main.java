import entities.ElementoMultimediale;
import entities.RegistrazioneAudio;
import entities.Video;
import entities.Immagine;
import interfaces.Riproducibile;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] player = new ElementoMultimediale[5];

        player[0] = new RegistrazioneAudio("Podcast", 3.45);
        player[1] = new Video("Tutorial Java", 2.27, 3, 2);
        player[2] = new Immagine("Foto Vacanza", 5);
        player[3] = new RegistrazioneAudio("Musica", 4.23);
        player[4] = new Video("Vlog", 5.54, 1, 4);

        int scelta = 2;

        if (scelta >= 0 && scelta < player.length) {
            ElementoMultimediale e = player[scelta];

            if (e instanceof Riproducibile) {
                ((Riproducibile) e).play();
            } else if (e instanceof Immagine) {
                ((Immagine) e).show();
            }
        }
    }
}