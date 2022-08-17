public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadeColoridas, boolean ehFrenteVerso) {
        if(TamanhoImpressao.A2 == tamanhoImpressao) {
            return new Impressao(totalPaginas,quantidadeColoridas,ehFrenteVerso,0.28,0.18,0.32,
                    0.22);
        }
        if(TamanhoImpressao.A3 == tamanhoImpressao) {
            return new Impressao(totalPaginas,quantidadeColoridas,ehFrenteVerso,0.25,0.15,0.30,
                    0.20);
        }
        if(TamanhoImpressao.A4 == tamanhoImpressao) {
            return new Impressao(totalPaginas,quantidadeColoridas,ehFrenteVerso,0.20,0.10,0.25,
                    0.15);
        }
        return null;
    }
}
