package comanda;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Produto vetor[] = new Produto[10];
        vetor[0] = new Produto(1, 4.50f, "Pastel");
        vetor[1] = new Produto(2, 2.50f, "Bolo");
        vetor[2] = new Produto(3, 3.50f, "Café");
        vetor[3] = new Produto(4, 2.75f, "Suco");
        vetor[4] = new Produto(5, 2.95f, "Refrigerante");
        vetor[5] = new Produto(6, 4.00f, "Coxinha");
        vetor[6] = new Produto(7, 1.50f, "Água");
        vetor[7] = new Produto(8, 2.25f, "Chocolate");
        vetor[8] = new Produto(9, 3.90f, "Coxinha");
        vetor[9] = new Produto(10, 6.50f, "Pizza");
        
        for(Produto produto: vetor){
            produto.imprimeMenu();     
        }
        
        Pedido p1 = new Pedido();
        int opcao = 0, produto = 0, quantidade;
        
        while(opcao != 2){
            System.out.println("--------------------------------------");
            System.out.println("Menu de opções: ");
            System.out.println("1 - Adicionar item ao pedido.");
            System.out.println("2 - Apresentar o total do pedido.");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            System.out.println("--------------------------------------");
     
              switch(opcao){
                 case 1:
                   while(produto < 1 || produto > 10){
                    System.out.print("Digite o código do produto (de 1 a 10): ");
                    produto = input.nextInt();
                    } 
                  System.out.print("Digite a quantidade: ");
                  quantidade = input.nextInt();
                  p1.adicionar_item(new itemPedido(vetor[produto-1], quantidade));
                  break;
                
                 case 2:
                  System.out.println("Total: R$ " +p1.obter_total());
                  break;
                  
                 default:
                  System.out.println("Atenção! Digite 1 ou 2.");
                  break;
            }
        } 
    }  
}
