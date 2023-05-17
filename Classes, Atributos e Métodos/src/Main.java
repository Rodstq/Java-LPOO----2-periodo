import java.io.StringBufferInputStream;

public class Main extends ControleRemoto{
    public static void main(String[] args) {
        //pacientes();
        //medicos();
        //street();
        //face();
        //aluno();

        ControleRemoto c = new ControleRemoto();

        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.fecharMenu();
    }

    public static void pacientes(){
        //criando novo objeto paciente ( 1 QUESTAO )
        Paciente eu = new Paciente(123, "athos","03/07/99", "masculino", "hapvida", "camarao", "a+");

        //instanciando objeto com meus dados
        int meuCodigo = eu.codigo;
        String meuNome = eu.nome;
        String meuNascimento = eu.dataNascimento;
        String meuSexo = eu.sexo;
        String meuPlano = eu.planoSaude;
        String minhaAlergia = eu.alergia;
        String meuTipoSanguineo = eu.tipoSanguineo;

        // imprimindo os atributos em forma de tabela
        System.out.printf("%n %-33s %-2s %n", " ATHOS ", " DADOS");
        System.out.printf("%-43s %-2s %n", "----------------------------------------------", "|");
        System.out.printf("%-35s %-10d %-1s %n", " meu codigo é : ", meuCodigo, "|");
        System.out.printf("%-35s %-10s %-1s %n", " meu nome é : ",meuNome, "|");
        System.out.printf("%-35s %-10s %-1s %n"," minha data de nascimento é : " ,meuNascimento, "|");
        System.out.printf("%-35s %-10s %-1s %n"," meu sexo é : " , meuSexo, "|");
        System.out.printf("%-35s %-10s %-1s %n"," meu plano de saude é : " , meuPlano, "|");
        System.out.printf("%-35s %-10s %-1s %n"," minha alergia é : ", minhaAlergia, "|");
        System.out.printf("%-35s %-10s %-1s %n"," meu tipo sanguineo é : ", meuTipoSanguineo, "|");
        System.out.printf("%-43s %-2s %n", "----------------------------------------------", "|");

        //modificando os dados do objeto com valores correspondentes aos da minha mãe;

        eu.codigo = 456;
        eu.nome = "maria";
        eu.dataNascimento = "13/08/66";
        eu.sexo ="feminino";
        eu.planoSaude = "policia militar";
        eu.alergia = "nenhuma";
        eu.tipoSanguineo = "A+";

        meuCodigo = eu.codigo;
        meuNome = eu.nome;
        meuNascimento = eu.dataNascimento;
        meuSexo = eu.sexo;
        meuPlano = eu.planoSaude;
        minhaAlergia = eu.alergia;
        meuTipoSanguineo = eu.tipoSanguineo;

        // imprimindo objeto eu atualizado com novos dados;

        System.out.printf("%n %-33s %-2s %n", meuNome.toUpperCase(), " DADOS");
        System.out.printf("%-56s %-1s %n", "----------------------------------------------", "|");
        System.out.printf("%-35s %-20d %-1s %n", " meu codigo é : ", meuCodigo, "|");
        System.out.printf("%-35s %-20s %-1s %n", " meu nome é : ",meuNome, "|");
        System.out.printf("%-35s %-20s %-1s %n"," minha data de nascimento é : " ,meuNascimento, "|");
        System.out.printf("%-35s %-20s %-1s %n"," meu sexo é : " , meuSexo, "|");
        System.out.printf("%-35s %-20s %-1s %n"," meu plano de saude é : " , meuPlano, "|");
        System.out.printf("%-35s %-20s %-1s %n"," minha alergia é : ", minhaAlergia, "|");
        System.out.printf("%-35s %-20s %-1s %n"," meu tipo sanguineo é : ", meuTipoSanguineo, "|");
        System.out.printf("%-56s %-1s %n", "----------------------------------------------", "|");
    }

    public static void medicos(){

        // ============   2 QUESTAO ===========

        // criando objeto endereco

        Endereco local = new Endereco("rua cobalto ", "167 ","bloco 2 ","cunhavos ","panameira ", "PE ", "54367-021 ");

        //adicionando endereco ( local ) em uma variavel para passar ao objeto medico
        String endereco = local.rua + local.numero + local.complemento + local.bairro + local.cidade + local.uf + local.cep;

        // criando objeto medico
        Medico serjao = new Medico(5647, "serjao ", "masculino ","cardio ", endereco);

        // imprimindo atributos

            System.out.printf("%n %-33s %-2s %n", serjao.nome.toUpperCase(), " DADOS");
            System.out.printf("%-56s %n", "----------------------------------------------");
            System.out.printf("%-35s %-20d  %n", " codigo : ", serjao.codigo);
            System.out.printf("%-35s %-20s  %n", " nome : ", serjao.nome);
            System.out.printf("%-35s %-20s  %n", " data de nascimento : ", serjao.sexo);
            System.out.printf("%-35s %-20s  %n", " especialidade : ", serjao.especialidade);
            System.out.printf("%-35s %-20s  %n", " endereço : ", serjao.endereco);
            System.out.printf("%-56s %n", "----------------------------------------------");


        //atualizando os dois objetos
        local.atualizar("rua abero", "763","apto 302","cariu","batista","PE","5842710");
        serjao.atualizar(5431,"hildon","masculino","orto",endereco);

        // imprimindo atributos atualizados

        System.out.printf("%n %-33s %-2s %n", serjao.nome.toUpperCase(), " DADOS");
        System.out.printf("%-56s %n", "----------------------------------------------");
        System.out.printf("%-35s %-20d  %n", " codigo : ", serjao.codigo);
        System.out.printf("%-35s %-20s  %n", " nome : ", serjao.nome);
        System.out.printf("%-35s %-20s  %n", " data de nascimento : ", serjao.sexo);
        System.out.printf("%-35s %-20s  %n", " especialidade : ", serjao.especialidade);
        System.out.printf("%-35s %-20s  %n", " endereço : ", serjao.endereco);
        System.out.printf("%-56s %n", "----------------------------------------------");

    }

    public static void street() {

        // ======== QUESTÃO 3 ======

        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);

        // ryu aplica golpes em bison

        for(int i = 0; i<3;i++) {
            ryu.reduzirEnergia(bison, bison.energia, ryu.forca);
        }

        System.out.printf("%n %1s %1f %n", "Bison sofre 3 golpes e sua vida é de : ", bison.energia);

        for (int i = 0; i<8;i++){
            bison.reduzirEnergia(ryu, ryu.energia, bison.forca);
        }

        System.out.printf("%n %1s %1f %n","Ryu sofre 8 golpes e sua vida é de : ", ryu.energia);


    }

    public static void face(){

        // ====  QUESTAO 4 ======

        // criando objeto post do facebook
        Post post = new Post("mandei o post pro mark", "http://facebook.com");

        //curtindo o post 3 vezes
        for ( int i = 0; i< 3; i++) {
            post.curtir();
        }

        //compartilhando o post 2 vezes
        for(int i = 0; i<2; i++){
            post.compartilhar();
        }

        // imprimindo as quantidades contidas no post
        System.out.println("\n o post foi curtido " + post.numeroCurtidas + " vezes e compartilhado " + post.numeroCompartilhamentos + " vezes");
    }

    private static void aluno() {

        // criando novo objeto aluno
        Aluno aluno = new Aluno("marliro","123473874837488374");

        // calculando a media e aramzenando em uma variavel
        double media = aluno.calcularMedia(8,8,7.5,8);

        //imprimindo o valor da variavel media
        System.out.println("\n a media é de : " + media);

        // alterando a segunda nota.
        aluno.nota2=5;

        // imprimindo nova media com nota atualizada
        System.out.println(" a media é de: " + aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3, aluno.nota4));


    }
}