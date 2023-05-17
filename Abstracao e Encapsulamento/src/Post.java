public class Post {

    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;


    public Post(String texto, String link){
        this.texto = texto;
        this.link = link;
    }

    private String getTexto() {
        return texto;
    }

    private void setTexto(String texto) {
        this.texto = texto;
    }

    private String getLink() {
        return link;
    }

    private void setLink(String link) {
        this.link = link;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    private void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    private void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }

    void curtir() {
        this.setNumeroCurtidas(this.getNumeroCurtidas() + 1);
    }

    void compartilhar(){
        this.setNumeroCompartilhamentos(this.getNumeroCompartilhamentos() + 1);
    }
}
