import java.time.LocalDate;
import java.time.Month;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Medico medico = new Medico("Raul","719711","raulneto@gmail.com",new Endereco("Rua boa vista",120,"em cima",9862145,"Salvador",UnidadeFederativa.BAHIA),LocalDate.of(1100, Month.JANUARY,10),Genero.MASCULINO,"751514564","4848484848","5151515",Setor.SAUDE,41515115,"41545415" ) ;
        Motoboy motoboy = new Motoboy("Raul","719711","raulneto@gmail.com",new Endereco("Rua boa vista",120,"em cima",9862145,"Salvador",UnidadeFederativa.BAHIA),LocalDate.of(1100, Month.JANUARY,10),Genero.MASCULINO,"751514564","4848484848","5151515",Setor.SAUDE,41515115,"4154544715" );
        Advogado advogado = new Funcionario("Raul","719711","raulneto@gmail.com",new Endereco("Rua boa vista",120,"em cima",9862145,"Salvador",UnidadeFederativa.BAHIA),LocalDate.of(1100, Month.JANUARY,10),Genero.MASCULINO,"751514564","4848484848","5151515",Setor.SAUDE,41515115,"4154544715" ) ;

        System.out.println(motoboy.toString());

    }


}