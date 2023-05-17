import java.util.InputMismatchException;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    private void setNome(String nome){
        this.nome = nome;
    }
    private void setPreco(double preco){
        this.preco = preco;
    }
    private void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void comprar(int quantidade) {
        try {
            this.setQuantidade(this.getQuantidade() - quantidade);
        } catch (InputMismatchException e) {
            System.out.println(" QUANTIDADE SUPERIOR AO ESTOQUE");
        }

    }
}
