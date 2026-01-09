import java.sql.SQLOutput;
import java.util.Scanner;

public class Condicional {
    public static void main (String [] args) {
/*
        String nome = "Lucas";
        double nota1 = 5.7 + 6.8 + 3.0;
        double media = nota1 / 3;

        if (media >= 5) {
            System.out.println("O aluno " + nome +  " foi Aprovado com nota :  " + media);

        }else {
            System.out.println("O aluno " + nome + "foi Reprovado com nota :  " + media);

        }
 */

        // Exemplos de Input (Interação com o Usúario)

        /* Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Nome : ");
        String palavra = leitura.nextLine();

        System.out.println("Digite sua Idade : ");
        int idade = leitura.nextInt();

        System.out.println("Digite sua Altura : ");
        double tamanho = leitura.nextDouble();

        System.out.println("Olá meu nome é  " + palavra + ", tenho  " + idade + " Anos, e minha altura é : " + tamanho +  " Metros."); */

        // Utilizando FOR

        /* Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite sua avaliação : ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de Avaliação é : " + mediaAvaliacao /4 ); */

        //  Utilizando WHILE

        /*Scanner leitura = new Scanner(System.in);

        double mediaNota = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota ou -1 para encerrar : ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaNota += nota;
                totalNotas++;
            }
        }

        if (totalNotas > 0){
            System.out.print("Media das notas : " +mediaNota / totalNotas );
        } else {
            System.out.print("Nenhuma nota foi registrada.");
        } */
    }
}
