public class Caneta{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " +this.cor);
        System.out.println("Carga: " +this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("A caneta está tampada? " +this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não se pode rabiscar...");
        } else{
            System.out.println("Está rabiscando.");  
         } 
    }
    
    void tampar(){
        this.tampada = true;   
    }
    
    void destampar(){
        this.tampada = false;
        
    }    
}
