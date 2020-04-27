package pkg23.pkg04.pkg2020;

public class Lutador{
    private String nome, nacionalidade, categoria;
    private float peso, altura;
    private int idade, vitorias, derrotas, empates;
    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
      
    //Métodos
    public void apresentar(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Apresenta-se o lutador: " +this.getNome());
        System.out.println("Pais: " +this.getNacionalidade());
        System.out.println("Com " +this.getIdade()+ " anos e " +this.getAltura()+ "m");
        System.out.println("Pesando " +this.getPeso()+ "Kg");
        System.out.println(this.getVitorias() + " vitória(s)");
        System.out.println(this.getDerrotas() + " derrota(s) e");
        System.out.println(this.getEmpates() + " empate(s).");
        System.out.println("-------------------------------------------------------");    
    }
    
    public void status(){
         System.out.println("********************************************************");
         System.out.println(this.getNome()+ " é um peso " +this.getCategoria());
         System.out.println("Ganhou " +this.getVitorias()+ " vez(es).");
         System.out.println("Perdeu " +this.getDerrotas()+ " vez(es).");
         System.out.println("Empatou " +this.getEmpates()+ " vez(es).");  
         System.out.println("********************************************************");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Inválido";
        } else if(peso <= 70.3){
             this.categoria = "Leve";
         } else if(peso <= 83.9){
              this.categoria = "Médio";
          } else if(peso <= 120.2){
               this.categoria = "Pesado";
           } else{
                this.categoria = "Inválido";
           }
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }  
    
}
