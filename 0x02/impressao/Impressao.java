public class Impressao {

    int paginasTotais;
    int paginasColoridas;
    Boolean ehFrenteVerso;
    double valorColoridasFrenteVerso;
    double valorPretoBrancoFrenteVerso;
    double valorColoridasFrenteApenas;
    double valorPretoBrancoFrenteApenas;


    public Impressao(int paginasTotais, int paginasColoridas, Boolean ehFrenteVerso,
                     double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso,
                     double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {
        if(ehFrenteVerso) {
            return (paginasColoridas*valorColoridasFrenteVerso) + ((paginasTotais-paginasColoridas)*valorPretoBrancoFrenteVerso);
        }
        return (paginasColoridas*valorColoridasFrenteApenas) + ((paginasTotais-paginasColoridas)*valorPretoBrancoFrenteApenas);

    }

    @Override
    public String toString() {
        return "total de paginas: "+ paginasTotais +", total coloridas: "+ paginasColoridas
                +", total preto e branco: "+ (paginasTotais-paginasColoridas)
                +", " + (ehFrenteVerso ? "frente e verso" : "frente")
                +". total: "+ String.format("%.2f",calcularTotal()) +".";
    }
}
