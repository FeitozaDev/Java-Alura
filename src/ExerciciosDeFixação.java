// Exercicios:


import java.util.Scanner;

public class ExerciciosDeFixação {
    public static void main (String [] args ){


        // 1 Converter temperatura de Celsius para Fahrenheit.

        /* double temperaturaCelsius = 35.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é de: " + temperaturaFahrenheitInteira); */



        // 2  Crie um programa que realize a média de duas notas decimais e exiba o resultado. :

       /*  float nota1 = 8.5f;
        float nota2 = 6.5f;

        float media = (nota1 + nota2) / 2;

        System.out.println( "A média das duas notas é : " + media); */


        // 3  Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        /*double variavel1 = 8.7;
        int variavel2 = (int) variavel1;

        System.out.println("Casting é : " + variavel2); */


        // 4 Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em
        //  uma mensagem.

        /*
        char letra = 'H';

        String palavra = "Hoje o dia esta bonito.";

        System.out.println("A palavra é " + palavra + " e a Letra é : " + letra);*/


        // 5 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço
        // do produto pela quantidade e apresente o resultado em uma mensagem.


        /*
        double precoProduto = 59.90;

        int quantidade = 10;

        double total = precoProduto * quantidade;

        String mensagem = "O valor em Reais dos produtos em estoque é de : " + total;
        System.out.println(mensagem); */

        // 6 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é
        // equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        /*

        double valorEmDolares = 50.50;
        double valorEmReais = valorEmDolares * 4.94;
        String mensagem = String.format(" O valor em Dólares convertido para Reais é de : %.2f", valorEmReais);
        System.out.println(mensagem);
        */



        // 7 Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.


        /*


        double precoOriginal = 99.90;
        double percentualDesconto = 30;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.println("O valor final do produto com 30% de desconto é de : " + precoFinal);

        */

        // 8 Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba
        // "Número negativo".
/*        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

*/

        // 9 Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm == numeroDois){
            System.out.println("Numero Iguais");
        } else if (numeroUm > numeroDois) {
            System.out.println("O primeiro número é maior.");
        }
        else {
            System.out.println("O segundo número é maior");
        }*/

        // 10 Crie um menu que oferece duas opções ao usuário:
        // "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        /* Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero != 3) {
            System.out.println("1° Calcular área do quadrado ");
            System.out.println("2° Calcular área do circulo ");
            System.out.println("3° Nenhuma das Anteriores.");
            System.out.print("Escolha uma das opções: ");

             numero = scanner.nextInt();

             if (numero == 1) {
                 System.out.println("Digite o lado do quadrado: ");
                 double lado = scanner.nextDouble();
                 double areaDoQuadrado = lado * lado;
                 System.out.println("A Área do quadrado é : " + areaDoQuadrado);
                 break;

             } else if (numero == 2) {
                 System.out.println("Digite a Área do circulo: ");
                 double circulo = scanner.nextDouble();
                 double areaDoCirculo = 3.14 * circulo * circulo;
                 System.out.println("O raio do circulo é de : " + areaDoCirculo);
                 break;
             } else if (numero == 3) {
                 System.out.println("Aplicação Encerrada.");
             } else {
                 System.out.println("Opção inválida, tente novamente.");
             }
        } */

        // 11 Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        /* Scanner scanner = new Scanner(System.in);

        System.out.println(" ========== Gerador de Tabuada. ============");
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Com esse número conseguimos a tabuada do " + numero);
        System.out.println(" ====================================== ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("====================================== ");
        System.out.println("Aplicação finalizada com sucesso. Bons estudos!");

        scanner.close(); */


        // 12 Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número Inteiro: ");

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número digitado é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }*/


        // 13 Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        /* Scanner scanner = new Scanner(System.in);
         System.out.println("Digite um número para saber o seu Fatorial: ");

         int numero = scanner.nextInt();

         int fatorial = 1;

         for (int i = 1; i <= numero; i++) {
             fatorial *= i;
         }
         System.out.println("O fatorial de " + numero + " é: " + fatorial); */
    }
}
