import java.time.LocalDate;

public class Cliente extends Fisica{
  private int protocoloAtendimento;

  //construtores

    public Cliente(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, int protocoloAtendimento) {
        super(nome, telefone, email, endereco, dataNascimento, genero);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    //Get e Set

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    //To String

    @Override
    public String toString() {
        return "/n Cliente:" +
                "/n ProtocoloAtendimento:" + protocoloAtendimento ;
    }
}
