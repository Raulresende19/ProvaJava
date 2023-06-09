public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminino");

    protected char caractere;
    protected String texto;

    //costrutores
    Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    //Metodos Get e Set

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
