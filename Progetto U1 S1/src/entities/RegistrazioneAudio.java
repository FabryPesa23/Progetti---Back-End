package entities;
import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
        this.volume = 5;
    }

    public void alzaVolume() { volume++; }
    public void abbassaVolume() { if(volume > 0) volume--; }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++) {
            System.out.print(titolo);
            for(int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}