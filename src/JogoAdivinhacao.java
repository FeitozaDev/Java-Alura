import java.util.Random;
import java.util.Scanner;



public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(4);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5 ) {
            System.out.println("Digite um número entre 0 e 50:  ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas +  "tentativas.! ");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroAleatorio ) {
            System.out.println("Você não acertou o número Gerado em 05 tentativas, o número gerado era : " +numeroAleatorio);
        }

    }
}
