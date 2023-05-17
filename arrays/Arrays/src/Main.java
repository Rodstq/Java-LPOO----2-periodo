import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
      //array();
      // arrays();
      //arrayss();
      //quadrado();
      //valores();
      //alturaEIdade();
      //registro();
      //preco();
      //sapatos();
        enquete();
    }

    public static void array(){
        int[] array = {1,4,5,3,2};

        for ( int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public static void arrays(){

        int[] array = {1,4,5,3,2,4,6,2,7,10};

        for ( int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public static void arrayss(){

        int[] array = {1,4,5,3,2,4,6,2,7,10,1,4,5,3,2,4,6,2,7,10,1,4,5,3,2,4,6,2,7,10};

        for ( int i = 0; i <= array.length ; i++){
            if ((i + 1) < array.length) {
                if (i == 0){
                    System.out.println(array[i]);
                }
                if ( (i%2) != 0) {
                    System.out.println(array[i + 1]);
                }
            } else {
                break;
            }
        }
    }

    public static void quadrado(){
        int [] array = new int[20];

        for ( int i = 0; i < array.length; i++){
            int valor = i*i;
            array[i] = valor;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void valores(){

        double maior = 0 ;
        double [] array = new double[500];
        double dividido = 0;

        for ( int i = 0; i< array.length; i++) {
            double num = ThreadLocalRandom.current().nextDouble();
            array[i]= num;

            if ( array[i] > maior){
                maior = array[i];
            }

            dividido = array[i] / maior;

            array[i] = dividido;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void alturaEIdade() {

        double[] array = new double[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array.length; i++) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.printf("Digite a altura : ");
            double altura = leitor1.nextDouble();

            Scanner leitor2 = new Scanner(System.in);
            System.out.printf("Digite a idade : ");
            int idade = leitor2.nextInt();

            array[i] = altura;
            array2[i] = idade;
        }
        System.out.printf("[");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");


        System.out.print("[");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array2[i] + ",");
        }
        System.out.printf("]");
    }


    public static void registro() {

        int[] volumeTotal = new int[30];
        int maior = 0;
        int diaDoMaior = 0;
        int dia = 1;

        for (int i = 0; i < volumeTotal.length; i++) {
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite o volume de carros no dia " + dia + " de setembro :  ");
            int volumeDoDia = leitor.nextInt();
            volumeTotal[i] = volumeDoDia;

            if(volumeDoDia > maior ){
                maior = volumeDoDia;
                diaDoMaior = dia;
            }
            dia++;
        }
        System.out.println("o maior volume foi de : " + maior + " no dia : " + diaDoMaior);

    }

    public static void preco(){
        double[] precosNoMes = new double[12];
        double media;
        double preco;
        double soma=0;
        int mes = 1;

        for (int i = 0; i < precosNoMes.length; i++){
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite o preço do produto no " + mes +"º do ano");
            preco = leitor.nextDouble();
            precosNoMes[i] = preco;

            soma = soma+preco;
            mes++;
        }
        media = soma / precosNoMes.length;

        System.out.println("a media de preco é de : " + media);

    }

    public static void sapatos(){
        double[] precos = new double[5];
        double preco =0;
        double aVista;
        double cartao;
        int contagem = 1;

        for (int i = 0; i<precos.length; i++){
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite o preco do " + contagem +"º sapato :  ");
            preco = leitor.nextDouble();
            precos[i] = preco;

            aVista = preco - (preco * 0.05);
            cartao = preco + (preco * 0.05);

            System.out.println(" o preço do " + contagem + "º sapato é de " + aVista + " a vista e de " + cartao + " no cartao" );
            contagem++;

        }
    }

    public static void enquete(){
        String[] os = {"Windows Server","Unix","Linux","Netware","Mac OS","Outro"};
        double[] votos = {0,0,0,0,0,0};
        double contagemVotosTotais = 0;

        int contagemW =0;
        int contagemU =0;
        int contagemL =0;
        int contagemN =0;
        int contagemM =0;
        int contagemO =0;

        for(int i = 0; ; i++){
            Scanner leitor = new Scanner(System.in);
            System.out.printf("\nQual o melhor Sistema Operacional para uso em servidores?\n" +
                    "\n As possíveis respostas são:\n " +
                    "\n1- Windows Server\n" +
                    "2- Unix\n" +
                    "3- Linux\n" +
                    "4- Netware\n" +
                    "5- Mac OS\n" +
                    "6- Outro\n" +
                    "Resposta ==>  ");
            String escolhido = leitor.nextLine();

            if(escolhido.equals("0")){
                break;
            }

            switch (escolhido){
                case "1":
                    //Windows
                    contagemW++;
                    votos[0] = contagemW;
                    break;
                case "2":
                    //unix
                    contagemU++;
                    votos[1] = contagemU;
                    break;
                case "3":
                    //Linux
                    contagemL++;
                    votos[2] = contagemL;
                    break;
                case "4":
                    //netware
                    contagemN++;
                    votos[3] = contagemN;
                    break;
                case "5":
                    //Mac OS
                    contagemM++;
                    votos[4] = contagemM;
                    break;
                case "6":
                    //outro
                    contagemO++;
                    votos[5] = contagemO;
                    break;
                default:
                    System.out.println(" VOTO INVALIDO");
                    contagemVotosTotais--;
            }
            contagemVotosTotais++;
        }



        System.out.printf("%1s %16s %7s","\nSistema Operacional","votos","%\n");

        System.out.println("---------------------------   --------   ----");
        for ( int j = 0; j< os.length;j++) {
            double porcent = (votos[j]/contagemVotosTotais)*100;
            System.out.printf("%-15s %19.0f %7.0f %-2s %n", os[j],votos[j],porcent,"%");
        }
        System.out.printf("%1s %20s","-------------------","---------\n");
        System.out.printf("%-15s %19.0f", "Total",contagemVotosTotais);

    }
}