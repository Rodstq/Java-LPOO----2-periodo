public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }
    private boolean getTocando(){
        return this.tocando;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setVolume( int volume){
        this.volume = volume;
    }

    private void setLigado ( boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }


    public void ligar() {
        this.setLigado(true);
    }
    public void desligar() {
        this.setLigado(false);
    }


    public void abrirMenu() {
        System.out.println("Esta ligado?" + this.getLigado());
        System.out.println("Esta tocando?" + this.getTocando());
        System.out.print("volume " + this.getVolume());

        for( int i = 0; i<= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }
    public void fecharMenu() {
        System.out.printf("\nFechando menu");
    }

    public void maisVolume() {
        if(getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }


    public void menosVolume() {
        if ( this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }


    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }
}
