import java.util.UUID;

public class CalculadorSalarioService {

    public UUID uuid = UUID.randomUUID();
    private static CalculadorSalarioService instancia;

    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService() {
        if(instancia == null) {
            return new CalculadorSalarioService();
        }
        return instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao) {
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

}
