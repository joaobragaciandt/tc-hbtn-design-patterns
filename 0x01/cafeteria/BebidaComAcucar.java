import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {
    public BebidaComAcucar(Bebida cafe) {
        super(cafe);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> lista = new ArrayList<>(super.obterIngredientes());
        lista.add("acucar");
        return lista;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
