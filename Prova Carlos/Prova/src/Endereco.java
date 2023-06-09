public class Endereco {
    protected String logadouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    public Endereco(String logadouro, int numero, String complemento, int cep, String cidade, UnidadeFederativa uf) {
        this.logadouro = logadouro;
        this.numero = String.valueOf(numero);
        this.complemento = complemento;
        this.cep = String.valueOf(cep);
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "/n Endereco:" +
                "/n Logadouro:" + logadouro +
                "/n Numero:" + numero +
                "/n Complemento:" + complemento +
                "/n Cep:" + cep +
                "/n Cidade:" + cidade +
                "/n Uf=:" + uf ;
    }
}
