import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //escreve();
        //numero();
        //media();
        //haras();
        //metragem();
        //areaQuadrado();
        //salario();
        //imc();
        temp();
    }

    public static void escreve(){

        System.out.println("Alô mundo");
    }
    public static void numero(){
         Scanner num = new Scanner(System.in);
         System.out.printf("Digite um número");
         int n = num.nextInt();
         System.out.println("O número informado foi : " + n);
    }

    public static void media () {
    Scanner num = new Scanner(System.in);
    System.out.printf("Digite a 1ª nota ");
    double nota1 = num.nextDouble();
    System.out.printf("Digite a 2ª nota ");
    double nota2 = num.nextDouble();
    System.out.printf("Digite a 3ª nota ");
    double nota3 = num.nextDouble();
    System.out.printf("Digite a 4ª nota ");
    double nota4 = num.nextDouble();
    double media = (nota1+nota2+nota3+nota4)/4;
    System.out.println("O valor da média do aluno é: " + media);
    }

    public static void haras(){
        Scanner cavalos = new Scanner(System.in);
        System.out.printf("Digite o número de cavalos no Haras : ");
        int quantidadeCavalos = cavalos.nextInt();
        int quantidadeFerraduras = quantidadeCavalos * 4;
        System.out.printf("A quantidade de ferraduras a ser comprada é de: " + quantidadeFerraduras);
    }

    public static void metragem(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite a quantidade de metros a ser convertida: ");
        double metros = leitor.nextDouble();
        double convertido = metros * 100;
        System.out.println("O valor em metros convertido para centímetros é de : " + convertido);
    }

    public static void areaQuadrado(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o lado do quadrado");
        double lado = leitor.nextDouble();
        System.out.print("Digite a altura do quadrado");
        double altura = leitor.nextDouble();
        double area = lado*altura;
        double areaX2 = area * 2;
        System.out.println("A área do quadrado é de: " + area + " e seu dobro é de:" + areaX2);
    }

    public static void salario(){
        Scanner hora = new Scanner(System.in);
        System.out.printf("Digite q quantidade de horas trabalhadas: ");
        int horas = hora.nextInt();
        System.out.printf("Digite o valor da hora: ");
        Scanner valorHora = new Scanner(System.in);
        double valorHoras = valorHora.nextDouble();
        double valorTotal = horas * valorHoras;
        System.out.println("O valor total a receber é de: " + valorTotal);
    }

    public static void imc(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite a altura do indivíduo: ");
        double altura = leitor.nextDouble();
        double pesoIdeal = (72*altura)-58;
        System.out.printf("O peso ideal é de: " + pesoIdeal);
    }
    public static void temp(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        double F = leitor.nextDouble();
        double C =(5*(F-32)/9);
        System.out.println("A temperatura em Celsius é de :" + C);
    }
}