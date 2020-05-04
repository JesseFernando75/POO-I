package comanda;

public class itemPedido{
    private int quantidade;
    private Produto produto;
    
    public itemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public float getValorUnitario(){
        return this.quantidade * this.produto.getValor();
    }
}
