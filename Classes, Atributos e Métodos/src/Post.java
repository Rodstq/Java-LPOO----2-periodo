public class Post {

    String texto;
    String link;
    int numeroCurtidas;
    int numeroCompartilhamentos;


    public Post(String texto, String link){
        this.texto = texto;
        this.link = link;
    }

    void curtir() {
        this.numeroCurtidas = numeroCurtidas + 1;
    }

    void compartilhar(){
        this.numeroCompartilhamentos = numeroCompartilhamentos + 1;
    }
}
