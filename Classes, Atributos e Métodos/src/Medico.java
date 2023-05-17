public class Medico {

    int codigo;
    String nome;
    String sexo;
    String especialidade;
    String endereco;

    // construtor
    public Medico(int codigo, String nome, String sexo, String especialidade, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    // metodo para setar novos atributos facilmente
    public void atualizar(int codigo, String nome, String sexo, String especialidade, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }


}
