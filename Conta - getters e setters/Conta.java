package main;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataNascimento;
    
    public Conta(String titular, int numero, String agencia, double saldo, String dataNascimento){
        this.setTitular(titular);
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setSaldo(saldo);
        this.setDataNascimento(dataNascimento);
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String recuperaDadosParaImpressao(){
         String dados = "Titular: " +this.getTitular();
          dados += "\nNúmero: " +this.getNumero();
          dados += "\nAgência: " +this.getAgencia();
          dados += "\nSaldo: " +this.getSaldo();
          dados += "\nData de nascimento: " +this.getDataNascimento();  
          return dados;
    } 
}
