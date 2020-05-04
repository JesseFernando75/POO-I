public class Produto{
    private int codigo;
    private float valor;
    private String descricao;
    
    public Produto(int codigo, float valor, String descricao){
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    } 
    
    public void imprimeMenu(){
        System.out.println(+this.codigo+ "; " +this.descricao+ " - R$ " +this.valor);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    } 
    
    public float getValor(){
        return this.valor;
    }
}
