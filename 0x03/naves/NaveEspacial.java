public class NaveEspacial {

    private int saude;
    private int ataque;

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return "Saude:"+ getSaude()+" - Ataque: " + getAtaque();
    }
}