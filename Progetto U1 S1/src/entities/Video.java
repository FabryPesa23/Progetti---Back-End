package entities;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private final double durata;
    private int luminosita;

    public Video(String titolo, double durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        if(volume > 0) {
            volume--;
        }
    }
    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        if(luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++) {
            System.out.print(titolo);
            for(int j = 0; j < volume; j++) System.out.print("!");
            for(int j = 0; j < luminosita; j++) System.out.print("*");
            System.out.println();
        }
    }
}