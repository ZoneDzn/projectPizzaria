package FormasDePagamento;

public class AdaptadorPedidoOnline implements PedidoPizza {
    private PedidoOnline pedidoOnline;

    public AdaptadorPedidoOnline(PedidoOnline pedidoOnline) {
        this.pedidoOnline = pedidoOnline;
    }

    @Override
    public void fazerPedido() {
        pedidoOnline.fazerPedidoOnline();
    }
}

