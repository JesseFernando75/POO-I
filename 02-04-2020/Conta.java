package main;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataNascimento;
    Data dataAbertura;
    
    boolean saca(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Operação realizada com sucesso.");
            return true;
        } 
        System.out.println("Saldo insuficiente.");
        return false;
    }
    
    void deposita(double valor){
        this.saldo += valor;  
    }
    
    void pulaLinha(){
        System.out.println();
    }
    
    double calculaRendimento(){
        return saldo * 0.1;
    }
    
    String recuperaDadosParaImpressao(){
         String dados = "Titular: " +this.titular;
          dados += "\nNúmero: " +this.numero;
          dados += "\nAgência: " +this.agencia;
          dados += "\nSaldo: " +this.saldo;
          dados += "\nData de abertura: " +this.dataAbertura.dia+ "/" +this.dataAbertura.mes+ "/" +this.dataAbertura.ano;
          dados += "\nData de nascimento: " +this.dataNascimento;  
          return dados;
    }
}
