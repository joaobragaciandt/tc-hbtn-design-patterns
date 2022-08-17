import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator {
    public BebidaComLeite(Bebida cafe) {
        super(cafe);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> lista = new ArrayList<>(super.obterIngredientes());
        lista.add("leite");
        return lista;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
