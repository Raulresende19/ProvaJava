import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    //Construtores

    public Advogado(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String oab) {
        super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
        this.oab = oab;
    }
    //Get e set

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    //To string

    @Override
    public String toString() {
        return "/n Advogado:" +
                "/n Oab:" + oab ;
    }
}
