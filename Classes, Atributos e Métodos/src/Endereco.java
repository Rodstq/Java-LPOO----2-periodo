public class Endereco {

 String rua;
 String numero;
 String complemento;
 String bairro;
 String cidade;
 String uf;
 String cep;

    // construtor endereco
     public Endereco(String rua, String numero, String complemento,String bairro, String cidade, String uf, String cep){
         this.rua = rua;
         this.numero = numero;
         this.complemento = complemento;
         this.bairro = bairro;
         this.cidade = cidade;
         this.uf = uf;
         this.cep = cep;
     }

     // metodo para setar novos atributos facilmente
     public void atualizar(String rua, String numero, String complemento,String bairro, String cidade, String uf, String cep){
         this.rua = rua;
         this.numero = numero;
         this.complemento = complemento;
         this.bairro = bairro;
         this.cidade = cidade;
         this.uf = uf;
         this.cep = cep;
     }

}
