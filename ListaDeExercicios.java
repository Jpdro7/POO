import java.util.Scanner;

public class ListaDeExercicios {
    public static void main(String[] args) {

        // 01º Questão
        System.out.println("Olá, Mundo!");

        // 02º Questão
        int num1 = 10;
        int num2 = 10;
        int num3 = num1 + num2;
        System.out.println(num3);

        // 03º Questão
        double numD1 = 5.67;
        double num4 = 3;
        double multiplicacao = numD1 * num4;
        System.out.println(multiplicacao);

        // 04º Questão
        char letra = 'A';
        System.out.println(letra);

        // 05º Questão
        boolean valorBoleano = true;
        System.out.println(valorBoleano);

        // 06º Questão
        String nome = "João Pedro Almeida";
        System.out.println(nome + " é um aluno dedicado.");

        // 07º Questão
        boolean temCarteira = false;
        System.out.println(temCarteira);
        temCarteira = true;
        System.out.println(temCarteira);

        // 08º Questão
        String frase = "Olá " + "Mundo";
        System.out.println(frase);

        // 09º Questão
        int numero1 = 10;
        int numero2 = 20;

        int resultadoAdicao = numero1 + numero2;
        int resultadoSubtracao = numero1 - numero2;
        int resultadoMultiplicacao = numero1 * numero2;
        int resultadoDivisao = numero1 / numero2;

        System.out.println("Soma: " + resultadoAdicao);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);

        // 10º Questão
        double saldo = 500.50;
        System.out.println("Saldo: " + saldo);
        saldo = 500.50 + 300.25;
        System.out.println("Saldo após o deposito: " + saldo);
        saldo = 800.75 - 150.75;
        System.out.println("Saldo após o saque: " + saldo);

        // 11º Questão
        String fruta1 = "Morango";
        String fruta2 = "Abacaxi";

        System.out.println("Eu gosto de " + fruta1 + " e " + fruta2);

        // 12º Questão
        int idade = 18;
        int messes = idade * 12;
        System.out.println(messes);

        // 13º Questão
        int numero3 = 11;
        if (numero3 > 0 && numero3 < 10){
            System.out.println("Está entra 0 e 10");
        }
        else {
            System.out.println("Não está entre 0 e 10");
        }

        // 14º e 15º Questão
        int numero4 = 7;

        if(numero4 % 2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("O numero é impar");
        }

        // 16º Questão
        int numero5 = 4;
        if(numero5 % 3 == 0){
            System.out.println("É multiplo de 3");
        }
        else {
            System.out.println("Não é multiplo de 3");
        }

        // 17º Questão
        int numero6 = 10;
        if (numero6 % 5 == 0){
            System.out.println("O numero é multiplo de 5");
        }
        else {
            System.out.println("O numero não é multiplo de 5");
        }

        // 18º Questão
        int numero7 = 7;
        if(numero7 % 7 == 0){
            System.out.println("O numero é multiplo de 7");
        }
        else {
            System.out.println("O numero não é multiplo de 7");
        }

        // 19º Questão
        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        int nota1 = numeros.nextInt();
        System.out.print("Digite sua segunda nota: ");
        int nota2 = numeros.nextInt();
        System.out.print("Digite sua terceira nota: ");
        int nota3 = numeros.nextInt();
        System.out.print("Digite sua quarta nota: ");
        int nota4 = numeros.nextInt();
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);

        // 20º Questão
        System.out.print("Digite quanto você ganha por hora: ");
        double valor = numeros.nextFloat();
        System.out.print("Digite quantas horas você trabalhou no mês: ");
        double horas = numeros.nextFloat();

        double salarioBruto = valor * horas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.05;
        double sindicato = salarioBruto * 0.05;
        double liquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Seu salario bruto foi: " + salarioBruto);
        System.out.println("Você pagou " + ir + " R$ de imposto de renda");
        System.out.println("Você pagou " + salarioBruto + " R$ de imposto do sindicato");
        System.out.println("Seu salario liquido foi: " + liquido);
    }
}
