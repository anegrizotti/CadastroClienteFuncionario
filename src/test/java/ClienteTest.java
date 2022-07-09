
import com.mycompany.atv.trabeng.dominio.Cliente;
import com.mycompany.atv.trabeng.dominio.GerenciadorCliente;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

    private GerenciadorCliente gerenciadorTeste;

    @Before
    public void setUp() {
        Cliente cliente1 = new Cliente("Nome teste1",
                "123.123.123-11",
                "email1@teste.com",
                "12 1234-1234"
        );

        Cliente cliente2 = new Cliente("Nome teste2",
                "123.123.123-12",
                "email2@teste.com",
                "12 1234-1234"
        );

        Cliente cliente3 = new Cliente("Nome teste3",
                "123.123.123-13",
                "email3@teste.com",
                "12 1234-1234"
        );

        GerenciadorCliente gerenciador = new GerenciadorCliente();
        gerenciador.InserirCliente(cliente1);
        gerenciador.InserirCliente(cliente2);
        gerenciador.InserirCliente(cliente3);

        this.gerenciadorTeste = gerenciador;
    }

    @After
    public void tearDown() {
        this.gerenciadorTeste.LimparListaClientes();
    }

    @Test
    public void InsereClienteTest() {
        Cliente novoCliente = new Cliente("Nome teste",
                "123.123.123-11",
                "email@teste.com",
                "12 1234-1234"
        );

        this.gerenciadorTeste.InserirCliente(novoCliente);

        assertNotNull(this.gerenciadorTeste.ListarClientes().get(3));
    }

    @Test
    public void RemoveClienteTest() {
        Cliente cliente = new Cliente("Nome teste",
                "123.123.123-11",
                "email@teste.com",
                "12 1234-1234"
        );

        boolean clienteExcluido = this.gerenciadorTeste.RemoverCliente(cliente);

        assertTrue(clienteExcluido);
    }
}
