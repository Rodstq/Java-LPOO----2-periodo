import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //numeros();
        //notas();
        //clientes();
        //numerosMaior();
        //numerosMedia();
        //intervalo();
        //potencia();
        //nota();
        //advinhar();
    }

    public static void numeros(){

        for ( ; ; ){
            Scanner num =  new Scanner(System.in);
            int numero = num.nextInt();

            if(numero > 0){
                System.out.println(numero);
            }else{
                break;
            }
        }

    }
    public static void notas(){
        for(;;){
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite uma nota entre 0 e 10 : ");
            double nota = leitor.nextDouble();
            if(nota > 0 && nota < 10){
                System.out.println("nota válida");
                break;
            }
        }
    }

    public static void clientes() {
        double maisAlto = 0;
        double maisPesado = 0;
        double maisMagro = 0;
        double maisBaixo = 0;
        double altura = 0;
        double peso = 0;
        int codigo = 0;
        int codigoAlto = 0;
        int codigoBaixo = 0;
        int codigoPesado = 0;
        int codigoMagro = 0;

        for ( int i = 0 ; ; i++ ) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Digite seu codigo");
            codigo = leitor1.nextInt();

            double alturaa = altura;
            double pesoo = peso;

            if (codigo == 0) {
                System.out.println(" o codigo do mais alto com " + maisAlto + " é : " + codigoAlto);
                System.out.println(" o codigo do mais baixo com " + maisBaixo + " é : " + codigoBaixo);
                System.out.println(" o codigo do mais pesado com " + maisPesado + " é : " + codigoPesado);
                System.out.println(" o codigo do mais magro com " + maisMagro + " é : " + codigoMagro);
                double mediaA = alturaa / i;
                double mediaP = pesoo / i;
                System.out.println(" a media de altura é de : " + mediaA + " e de peso é de : " + mediaP);
                break;
            }

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite sua altura");
            altura = leitor2.nextDouble();


            Scanner leitor3 = new Scanner(System.in);
            System.out.println("Digite seu peso");
            peso = leitor3.nextDouble();

            if (altura > maisAlto) {
                maisAlto = altura;
                codigoAlto = codigo;
            }

            if (peso > maisPesado ){
                maisPesado = peso;
                codigoPesado = codigo;
            }

            if (i == 0){
                maisBaixo = altura;
                codigoBaixo = codigo;
                maisMagro = peso;
                codigoMagro = codigo;
            }
            if ( altura < maisBaixo){
                maisBaixo = altura;
                codigoBaixo = codigo;
            }

            if ( peso < maisMagro){
                maisMagro = peso;
                codigoMagro = codigo;
            }
            alturaa=+ altura;
            pesoo=+ peso;
        }
    }

    public static void numerosMaior(){

         int maior = 0;

         for ( int i = 0; i < 50; i++) {
             Scanner leitor = new Scanner(System.in);
             System.out.printf("Digite um número : ");
             int n = leitor.nextInt();
             if (n > maior){
                 maior = n;
             }
         }
        System.out.println(maior);
    }

    public static void numerosMedia(){

        int numero = 0;
        int vezes = 5;

        for (int i = 0; i < vezes ; i++) {
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite um número : ");
            int n = leitor.nextInt();
            numero = numero + n;
        }
        int media = numero / vezes;
        System.out.println("A media é :" + media);
    }

    public static void intervalo(){
        Scanner leitor1 = new Scanner(System.in);
        int menorNumero = leitor1.nextInt();

        Scanner leitor = new Scanner(System.in);
        int maiorNumero = leitor.nextInt();

        for (int i = menorNumero; i < maiorNumero; i++){
            System.out.println(i);
        }
    }

    public static void potencia(){
        int potenciado =1;

        Scanner numero1 = new Scanner(System.in);
        System.out.printf("digite a base");
        int base = numero1.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.printf("digite o expoente");
        int expoente = numero2.nextInt();

        for (int i = 0; i < expoente; i++){
            potenciado = potenciado*base;
        }
        System.out.println("a potencia resulta em : " + potenciado);
    }

    public static void nota(){

        int pontuacao = 0;

        for(int i = 0; i < 10 ; i++){
            String certa = "";

            Scanner questao = new Scanner(System.in);
            System.out.printf("Digite a resposta : ");
            String resposta = questao.nextLine();

            switch(i){
                case 0:
                    certa = "a";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;
                case 1:
                    certa = "b";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 2:
                    certa = "c";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 3:
                    certa = "d";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 4:
                    certa = "e";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 5:
                    certa = "e";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 6:
                    certa = "d";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 7:
                    certa = "c";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 8:
                    certa = "b";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;

                case 9:
                    certa = "a";
                    if(resposta.equals(certa)){
                        pontuacao= pontuacao +1;
                    }
                    break;
            }
        }
        System.out.println(" a nota final é de : " + pontuacao);
    }

    public static void advinhar(){
        Scanner leitor1 = new Scanner(System.in);
        System.out.printf("Digite o numero correto :");
        int numeroCorreto = leitor1.nextInt();
        int tentativas = 0;

        for (int i = 0 ; ; i++){
            Scanner leitor2 = new Scanner(System.in);
            System.out.printf("Advinhe o número : ");
            int palpite = leitor2.nextInt();
            tentativas++;

            if( palpite > numeroCorreto){
                System.out.println("Seu número é maior do que o meu");
            } else if( palpite < numeroCorreto){
                System.out.println("Seu número é menor do que o meu");
            } else {
                System.out.println(" você acertou o número !!!!!!! (" + numeroCorreto +") , em " + tentativas + " tentativas." );
                break;
            }
        }

    }

}