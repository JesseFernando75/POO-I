package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor;
        
        Conta c1 = new Conta("Roberto", 456, "1234-8", 0, "08/02/1984");
       
        System.out.println(c1.recuperaDadosParaImpressao()); 
    }
}
