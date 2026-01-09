// Exercicios:



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


    }
}
