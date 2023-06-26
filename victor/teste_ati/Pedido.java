public class Pedido {
    private Cliente cliente;
    private String data;
    private List<ItemPedido> itens = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
        }
        return total;
    }
}
