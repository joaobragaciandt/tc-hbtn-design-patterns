public class LadraoBuilder implements Builder {

    protected String nome;
    protected int inteligencia;
    protected TipoPersonagem tipo;
    protected int forca;
    protected int vigor;
    protected int resistencia;
    protected int destreza;

    public Ladrao build() {
        return new Ladrao(this);
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }


}
