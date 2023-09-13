package FormasDePagamento;

public class AdaptadorPedidoTelefone implements PedidoPizza {
    private PedidoTelefone pedidoTelefone;

    public AdaptadorPedidoTelefone(PedidoTelefone pedidoTelefone) {
        this.pedidoTelefone = pedidoTelefone;
    }

    @Override
    public void fazerPedido() {
        pedidoTelefone.fazerPedidoTelefone();
    }
}
