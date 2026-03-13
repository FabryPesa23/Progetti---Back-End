import entities.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio audio = new RegistrazioneAudio("Test Audio", 3);

        audio.alzaVolume();
        audio.alzaVolume();

        audio.play();

    }
}