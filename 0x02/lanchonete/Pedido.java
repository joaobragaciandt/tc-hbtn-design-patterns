import java.util.HashSet;
import java.util.Iterator;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        itensForaCaixa = new HashSet<>();
        itensDentroCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String strForaCaixa = "\tFora da Caixa:\n";
        String strDentroCaixa = "\tDentro da Caixa:\n";
        for (ItemPedido i : itensForaCaixa) {
            String novaStr = "\t\t- " + i.getTipo() + " " + i.getNome() + "\n";
            strForaCaixa = strForaCaixa.concat(novaStr);
        }
        Iterator<ItemPedido> itr = itensDentroCaixa.iterator();
        while (itr.hasNext()) {
            ItemPedido i = itr.next();
            String novaStr = "\t\t- " + i.getTipo() + " " + i.getNome() + "\n";
            strDentroCaixa = strDentroCaixa.concat(novaStr);
        }

        return strForaCaixa + strDentroCaixa;
    }
}
