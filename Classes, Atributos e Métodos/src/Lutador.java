public class Lutador {

    String nome;
    double energia;
    double forca;

    public Lutador(String nome, double energia, double forca){
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    void reduzirEnergia(Lutador lutador, double energia, double forca){
        lutador = lutador;
        lutador.energia = energia - forca;

    }
}
