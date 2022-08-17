public class PedidoBuilder extends PedidoAbstractBuilder {

    private Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setNome(tipo.name());
        itemPedido.setTipo(TipoItemPedido.LANCHE);
        pedido.adicionarItemDentroCaixa(itemPedido);

    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setNome(tamanho.name());
        itemPedido.setTipo(TipoItemPedido.BATATA);
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setNome(tipo.name());
        itemPedido.setTipo(TipoItemPedido.BRINDE);
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setNome(tipo.name());
        itemPedido.setTipo(TipoItemPedido.BEBIDA);
        pedido.adicionarItemForaCaixa(itemPedido);
    }

    public Pedido build() {
        return pedido;
    }
}
