public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    //construtores

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    //Get e set

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    //To String

    @Override
    public String toString() {
        return "/n Juridica:" +
                "/n Cnpj:" + cnpj +
                "/n InscricaoEstadual:" + inscricaoEstadual;
    }
}
