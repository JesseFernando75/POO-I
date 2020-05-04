package comanda;
        
public class Pedido{
    private float valor_total = 0;
    private itemPedido item;
    
    public void adicionar_item(itemPedido item){
        this.item = item;
        this.valor_total += this.item.getValorUnitario();
    }
    
    public float obter_total(){
        return valor_total;
    }
}
