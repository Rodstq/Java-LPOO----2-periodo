public class Aviao {

    private double altitude;
    private double velocidade;

    public Aviao(double altitude, double velocidade){
        this.altitude = altitude;
        this.velocidade = velocidade;
    }
    public double getAltitude(){
        return this.altitude;
    }
    public double getVelocidade(){
        return this.velocidade;
    }
    private void setAltitude(double altitude){
        this.altitude = altitude;
    }
    private void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public void desacelerar(double aceleracao){
        this.setVelocidade(this.getVelocidade() - aceleracao);
    }

    public void reduzirAltitude(double abaixar){
        this.setAltitude(this.getAltitude() - abaixar);
    }

}
