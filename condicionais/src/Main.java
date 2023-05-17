import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //numeros();
        //numerosDnv();
       // televisao();
        //saldo();
        //cinema();
        //salario();
        //suspeito();
        triangulo();
    }

    public static void numeros(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite o primeiro numero");
        int numero1 = leitor.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.print("digite o segundo numero");
        int numero2 = leitor.nextInt();

        if(numero1 > numero2){
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
    }

    public static void numerosDnv(){
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor1.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        int numero2 = leitor2.nextInt();
        System.out.println("Digite o terceiro número: ");
        Scanner leitor3 = new Scanner(System.in);
        int numero3 = leitor3.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println(numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println(numero3);
        } else {
            System.out.println(" Os números são iguais ");
        }
    }

    public static void televisao(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o canal desejado :  ");
        int canal = leitor.nextInt();
        String canalEscolhido;

        switch (canal) {
            case 2:
                canalEscolhido = "SBT";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            case 4:
                canalEscolhido = "BAND";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            case 6:
                canalEscolhido = "RedeTV";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            case 7:
                canalEscolhido = "MTV";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            case 9:
                canalEscolhido = "Record";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            case 13:
                canalEscolhido = "Globo";
                System.out.println("O canal escolhido foi : " + canalEscolhido);
                break;
            default:
                System.out.println("Canal inválido");

        }
    }

    public static void saldo() {
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o saldo da conta : ");
        double saldo = leitor1.nextDouble();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite o saldo da conta : ");
        double debitos = leitor2.nextDouble();
        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Digite o saldo da conta : ");
        double creditos = leitor3.nextDouble();

        double saldoFinal = saldo - debitos - creditos;

        if (saldoFinal > 0) {
            System.out.println("Saldo positivo em " + saldoFinal + " reais");
        } else if (saldoFinal < 0) {
            System.out.println("Saldo negativo em " + saldoFinal + "reais");
        } else {
            System.out.println("Saldo zero");
        }
    }

    public static void cinema(){
        double descontoDia= 0;
        double descontoMenores14 = 0.5;
        double descontoIdade = 0;
        double ingresso = 0;
        int dia;
        int idade;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        dia = leitor1.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite a idade do cliente : ");
        idade = leitor2.nextInt();
        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Digite o valor do ingresso : ");
        ingresso = leitor3.nextDouble();

        if(dia == 3){
            descontoDia = 0.5;
        }
        if(idade < 14){
            descontoIdade = 0.5;
        }

        double desconto = (ingresso*descontoDia) + (ingresso*descontoIdade);
        double valorFinal = ingresso - desconto;
        System.out.println(" o preço final é de : " + valorFinal);

    }

    public static void salario(){
        double salario;
        double aumento = 0;
        double salarioFinal = 0;
        double aumentoAplicado = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o salario do colaborador : ");
        salario = leitor1.nextInt();

        if(salario <= 280){
            aumento = 0.2;
            aumentoAplicado = salario * aumento;
            salarioFinal = salario + aumentoAplicado;
        } else if ( salario > 280 && salario < 700){
            aumento = 0.15;
            aumentoAplicado = salario * aumento;
            salarioFinal = salario + aumentoAplicado;
        } else if ( salario > 700 && salario < 1500){
            aumento = 0.1;
            aumentoAplicado = salario * aumento;
            salarioFinal = salario + aumentoAplicado;
        } else if ( salario > 1500){
            aumento = 0.05;
            aumentoAplicado = salario * aumento;
            salarioFinal = salario + aumentoAplicado;
        }

        System.out.println(" O salario inicial era de  " + salario + " o percentual foi de " + aumento + " o valor do aumento foi de " + aumentoAplicado + " e o novo salario é de " + salarioFinal);
    }

    public static void suspeito(){

        int suspeitividade = 0;
        String sim = "sim";

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Telefonou para a vitima?");
        String resposta1 = leitor1.nextLine();
        if(resposta1.equals(sim)){
            suspeitividade++;
        }

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Esteve no local do crime?");
        String resposta2 = leitor1.nextLine();
        if(resposta2.equals(sim)){
            suspeitividade++;
        }

        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Mora perto da vítima?");
        String resposta3 = leitor1.nextLine();
        if(resposta3.equals(sim)){
            suspeitividade++;
        }

        Scanner leitor4 = new Scanner(System.in);
        System.out.println("Já trabalhou com a vítima?");
        String resposta4 = leitor4.nextLine();
        if(resposta4.equals(sim)){
            suspeitividade++;
        }

        Scanner leitor5 = new Scanner(System.in);
        System.out.println("Devia para a vítima?");
        String resposta5 = leitor5.nextLine();
        if(resposta5.equals(sim)){
            suspeitividade++;
        }

        if(suspeitividade == 2){
            System.out.println(" Suspeita");
        } else if (suspeitividade >= 3 && suspeitividade <= 4){
            System.out.println("Cumplice");
        } else if(suspeitividade >= 5){
            System.out.println("Assassino");
        } else{
            System.out.println("Inocente");
        }
    }

    public static void triangulo() {
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o lado 1 do triangulo : ");
        double lado1 = leitor1.nextDouble();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite o lado 2 do triangulo : ");
        double lado2 = leitor2.nextDouble();

        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Digite o lado 3 do triangulo : ");
        double lado3 = leitor3.nextDouble();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
            System.out.println("o triangulo é possivel");
        } else {
            System.out.println("o triangulo não é possivel");
        }

        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("o triangulo é equilatero");
        } else if (lado1 == lado2 && lado1 != lado3){
            System.out.println("o tirangulo é isoceles");
        } else {
            System.out.println("o triangulo é escaleno");
        }

    }

}