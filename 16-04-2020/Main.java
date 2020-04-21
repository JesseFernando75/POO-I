package pkg16.pkg04.pkg2020;

public class Main {
    public static void main(String[] args) {
        
        Estudante aluno1 = new Estudante(11, "João");
        System.out.println(aluno1.getCodigo());
        System.out.println(aluno1.getNome());
        
        aluno1.setNotas(5.4, 3.2, 4.5);
        System.out.printf("Média: %.2f \n", aluno1.calculaMedia());
        System.out.printf("Nova média: %.2f \n", aluno1.calculaMedia(0.5));
        
        Data d1 = new Data(29, 02, 2020);
        System.out.println(d1.getData());
    }  
}
