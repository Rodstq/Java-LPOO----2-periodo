import javax.lang.model.element.PackageElement;
import java.util.prefs.PreferenceChangeEvent;

public class Main {
    public static void main(String[] args) {

        // questao1();
        //questao2();
        //questao3();
        questao4();


    }

    public static void questao1(){

        //  QUESTAO 1 DA LISTA DE Classes, Atributos e Métodos  UTILIZANDO ENCAPSULAMENTO

        Paciente i = new Paciente( 24, " zezin ", "22/03/2021 ", "masculino ", "hapvida ", "amendoim ", "a+ ");
        System.out.println(i.getCodigo() + i.getNome() + i.getDataNacsimento() + i.getSexo() + i.getPlanoSaude() + i.getAlergia() + i.getTipoSanguineo());

        i.setCodigo(12);
        i.setNome(" maria ");
        i.setDataNacsimento(" 13/08/1966 ");
        i.setSexo(" feminino ");
        i.setPlanoSaude(" policia militar ");
        i.setAlergia(" nada ");
        i.setTipoSanguineo(" a ");

        System.out.println(i.getCodigo() + i.getNome() + i.getDataNacsimento() + i.getSexo() + i.getPlanoSaude() + i.getAlergia() + i.getTipoSanguineo());

    }

    public static void questao2(){

        Post post = new Post("asfgsdadsfadf", "https oahsdkjashdjak");
        post.curtir();
        post.curtir();
        post.curtir();
        System.out.println(post.getNumeroCurtidas());
        post.compartilhar();
        post.compartilhar();
        System.out.println(post.getNumeroCompartilhamentos());

    }

    public static void questao3(){
        Aviao aviao = new Aviao(10,900);
        System.out.println("A altitude do aviao é de : " + aviao.getAltitude() + " km e velocidade de : " + aviao.getVelocidade());
        aviao.reduzirAltitude(1);
        aviao.desacelerar(100);

        System.out.println("A altitude do aviao é de : " + aviao.getAltitude() + " km e velocidade de : " + aviao.getVelocidade());

        aviao.reduzirAltitude(10);
        aviao.desacelerar(200);

        System.out.println("A altitude do aviao é de : " + aviao.getAltitude() + " km e velocidade de : " + aviao.getVelocidade());
    }

    public static void questao4(){
        Produto produto = new Produto("caderno", 15.99, 10);
        System.out.println(" o produto é " + produto.getNome() + " e seu preço é de : " + produto.getPreco());
        produto.comprar(1);
        System.out.println("a quantidade é de : " + produto.getQuantidade());
        produto.comprar(1);
        System.out.println("a quantidade é de : " + produto.getQuantidade());
        produto.comprar(9);
        System.out.println(" a quantidade é de :" + produto.getQuantidade());
    }

}