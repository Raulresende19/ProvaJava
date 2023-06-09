import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;

    //Construtores

    public Medico(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
        super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }
    //Get e set

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    //To String

    @Override
    public String toString() {
        return "/n Medico:" +
                "/n Crm:" + crm;
    }
}
