import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String cnh;

    //Construtores

    public Motoboy(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String cnh) {
        super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
        this.cnh = cnh;
    }
    //Get e set

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    //To string

    @Override
    public String toString() {
        return "/n Motoboy:" +
                "/n Cnh:" + cnh;
    }
}
