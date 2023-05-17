public class Paciente {
    private int codigo;
    private String nome;
    private String dataNacsimento;
    private String planoSaude;
    private String alergia;

    private String sexo;
    private String tipoSanguineo;

    public Paciente(int codigo, String nome, String dataNacsimento, String sexo, String planoSaude, String alergia, String tipoSanguineos){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNacsimento = dataNacsimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineos;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacsimento() {
        return dataNacsimento;
    }

    public void setDataNacsimento(String dataNacsimento) {
        this.dataNacsimento = dataNacsimento;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
