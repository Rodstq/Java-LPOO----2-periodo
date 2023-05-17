import java.util.Scanner;

public class Strings {

    public static void main (String[] args){
        //nome();
        //titulo();
        //converter();
        //formacao();
        //senha();
        //posicao();
        //primeiraLetra();
        //sobrenome();
        //alunos();
        caixaAlta();
}
    public static void nome(){
        Scanner leitor1 = new Scanner(System.in);
        String nome1 = leitor1.next();

        Scanner leitor2 = new Scanner(System.in);
        String nome2 = leitor2.next();

        if(nome1.equals(nome2)){
            System.out.println("Possuem o mesmo nome");
        } else {
            System.out.println("Não possuem o mesmo nome");
        }
    }

    public static void titulo(){
        Scanner leitor1 = new Scanner(System.in);
        String titulo = leitor1.next();

        if (titulo.length() > 19){
            System.out.println("Título acima do permitido");
        } else {
            System.out.println("Titulo com tamanho permitido");
        }
    }
    public static void converter(){
        Scanner leitor1 = new Scanner(System.in);
        int numero = leitor1.nextInt();

        String converitdo = String.valueOf(numero);
        System.out.println(converitdo);
    }

    public static void formacao(){
        Scanner leitor1 = new Scanner(System.in);
        String ano = leitor1.next();

        int anoNum = Integer.parseInt(ano);
        int formatura = anoNum +3;

        System.out.println(formatura);
    }

    public static void senha(){
        Scanner leitor1 = new Scanner(System.in);
        String senha = leitor1.nextLine();

        senha = senha.trim();

        if(senha.equalsIgnoreCase("eu amo programar")){
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Senha Incorreta");
        }
    }

    public static void posicao(){
        String frase = "eu amo programar";
        int index = frase.indexOf("programar");
        System.out.println(index);
    }

    public static void primeiraLetra(){
        Scanner leitor1 = new Scanner(System.in);
        String nome = leitor1.nextLine();

        System.out.println(nome.charAt(0));
    }

    public static void sobrenome() {
        Scanner leitor1 = new Scanner(System.in);
        String nome = leitor1.nextLine();
        nome = nome.trim();
        int sobrenome = nome.indexOf(" ");

        System.out.println(nome.substring(sobrenome+1));
    }

    public static void alunos(){
        Scanner leitor1 = new Scanner(System.in);
        String aluno1 = leitor1.nextLine();
        Scanner leitor2 = new Scanner(System.in);
        String aluno2 = leitor2.nextLine();

        if(aluno1.compareToIgnoreCase(aluno2) < 0){
            System.out.println(aluno1);
            System.out.println(aluno2);
        } else {
            System.out.println(aluno2);
            System.out.println(aluno1);
        }
    }

    public static void caixaAlta(){
        Scanner leitor1 = new Scanner(System.in);
        String titulo = leitor1.nextLine();

        System.out.println(titulo.toUpperCase());

    }

}

