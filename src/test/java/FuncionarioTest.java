
import com.mycompany.atv.trabeng.dominio.Funcionario;
import com.mycompany.atv.trabeng.dominio.GerenciadorFuncionario;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FuncionarioTest {

    private GerenciadorFuncionario gerenciadorTeste;

    @Before
    public void setUp() {
        Funcionario funcionario1 = new Funcionario("Nome teste1",
                "123.123.123-11",
                "email1@teste.com",
                "12 1234-1234",
                1500);

        Funcionario funcionario2 = new Funcionario("Nome teste2",
                "123.123.123-12",
                "email2@teste.com",
                "12 1234-1234",
                1600);

        Funcionario funcionario3 = new Funcionario("Nome teste3",
                "123.123.123-13",
                "email3@teste.com",
                "12 1234-1234",
                1700);

        GerenciadorFuncionario gerenciador = new GerenciadorFuncionario();
        gerenciador.InserirFuncionario(funcionario1);
        gerenciador.InserirFuncionario(funcionario2);
        gerenciador.InserirFuncionario(funcionario3);

        this.gerenciadorTeste = gerenciador;
    }

    @After
    public void tearDown() {
        this.gerenciadorTeste.LimparListaFuncionarios();
    }

    @Test
    public void InsereFuncionarioTest() {
        Funcionario novoFuncionario = new Funcionario("Nome teste",
                "123.123.123-11",
                "email@teste.com",
                "12 1234-1234",
                1500);

        this.gerenciadorTeste.InserirFuncionario(novoFuncionario);

        assertNotNull(this.gerenciadorTeste.ListarFuncionarios().get(3));
    }

    @Test
    public void RemoveFuncionarioTest() {
        Funcionario funcionario = new Funcionario("Nome teste",
                "123.123.123-11",
                "email@teste.com",
                "12 1234-1234",
                1500);

        boolean funcionarioExcluido = this.gerenciadorTeste.RemoverFuncionario(funcionario);

        assertTrue(funcionarioExcluido);
    }

}
