public class QuantidadeInvalidaException extends Exception{
    int quantidade;

    public void setQuantidade(int quantidade){
        if(quantidade <= this.quantidade){
            this.quantidade = this.quantidade-quantidade;
        } else {

        }
    }
}
