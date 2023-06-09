import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa {

    protected LocalDate dataNascimento;
    protected Genero genero;

    //constutores

    public Fisica(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    //Return de getIdade
    public int getIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
    }
    //Metodo Get e set

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //To string


    @Override
    public String toString() {
        return "Fisica{" +
                "dataNascimento=" + dataNascimento +
                ", genero=" + genero +
                '}';
    }
}
