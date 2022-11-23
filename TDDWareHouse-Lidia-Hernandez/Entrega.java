
public class Entrega {
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int realizarEntrega(Pedido unPedido) {
        if(pedido != null) {
            pedido = null;
            return 1;
        }
        return 0;
    }
}