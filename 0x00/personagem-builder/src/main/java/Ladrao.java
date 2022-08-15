public class Ladrao extends Personagem{

    public Ladrao(LadraoBuilder ladraoBuilder) {
        this.nome = ladraoBuilder.nome;
        this.tipo = ladraoBuilder.tipo;
        this.forca = ladraoBuilder.forca;
        this.vigor = ladraoBuilder.vigor;
        this.destreza = ladraoBuilder.destreza;
        this.inteligencia = ladraoBuilder.inteligencia;
        this.resistencia = ladraoBuilder.resistencia;
    }

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) throws Exception {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
        if(destreza<forca || destreza<inteligencia) {
            throw new Exception("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (forca * 0.5) + (destreza * 0.35) + (vigor * 0.1) + (inteligencia * 0.05);
    }

}

