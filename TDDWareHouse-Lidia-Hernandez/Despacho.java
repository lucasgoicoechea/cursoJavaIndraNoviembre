
public class Despacho {
    private Pedido pedido = null;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int registrarDespachaje(Pedido unPedido) {
        this.pedido = unPedido;
        unPedido.setEstado(Estado.DESPACHADO);
        return 1;
    }
}
