package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor;
        
        Conta c1 = new Conta();
        c1.titular = "Roberto";
        c1.numero = 456;
        c1.agencia = "1234-8";
        c1.saldo = 0;
        c1.dataNascimento = "08/02/1984";
        Data abertura = new Data(); 
        c1.dataAbertura = abertura;
        c1.dataAbertura.dia = 02;
        c1.dataAbertura.mes = 05;
        c1.dataAbertura.ano = 1964;
       
        Conta c2 = c1;
        
        if(c1 == c2){
            System.out.println("As contas são iguais.");
        } else{
            System.out.println("As conta são diferentes.");
         }
        c1.pulaLinha();
          
        System.out.print("Digite o valor a ser depositado na conta numero " +c1.numero+ " de titular " +c1.titular+ ": ");
        valor = input.nextDouble();
        
        c1.deposita(valor);
        c1.pulaLinha();
        System.out.println(c1.recuperaDadosParaImpressao());
        c1.pulaLinha();
        
        System.out.print("Digite o valor a ser sacado: ");
        valor = input.nextDouble();

        c1.saca(valor);
        c1.pulaLinha();
        System.out.println("Saldo atual: " +c1.saldo);
        System.out.printf("Rendimento: %.2f\n", c1.calculaRendimento());
    }
}
