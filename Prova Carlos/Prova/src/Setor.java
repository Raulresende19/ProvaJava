public enum Setor {
    ENGENHARIA("Engenheiro"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    OPERACOES("Operações");

    protected String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
