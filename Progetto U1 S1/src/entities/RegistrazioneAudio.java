package entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
        this.volume = 5;
    }

    public void alzaVolume() { volume++; }
    public void abbassaVolume() { if(volume > 0) volume--; }

    }