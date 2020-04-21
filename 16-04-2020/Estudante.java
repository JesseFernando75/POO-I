package pkg16.pkg04.pkg2020;

public class Estudante {
    private int codigo;
    private String nome;
    private Data dataNasc;
    private double notaMat;
    private double notaPort;
    private double notaCien;
    
    public Estudante(int c, String n){
        this.codigo = c;
        this.nome = n;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNotas(double m, double p, double c){
        this.notaMat = m;
        this.notaPort = p;
        this.notaCien = c;
    }
    
    public double calculaMedia(){
        return ((this.notaMat + this.notaPort + this.notaCien) / 3);  
    }
    
    public double calculaMedia(double e){
        return calculaMedia() + e; 
    }  
}
