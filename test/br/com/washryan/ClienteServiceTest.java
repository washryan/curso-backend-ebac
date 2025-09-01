package br.com.washryan;

import br.com.washryan.dao.ContratoDao;
import br.com.washryan.dao.IContratoDao;
import br.com.washryan.dao.mocks.ContratoDaoMock;
import br.com.washryan.service.ContratoService;
import br.com.washryan.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }

    @Test
    public void buscarContratoMockTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String contrato = service.buscar(1);
        Assert.assertEquals("Contrato 1", contrato);
    }

    @Test
    public void atualizarContratoMockTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar(1, "Novo contrato");
        Assert.assertEquals("Atualizado", retorno);
    }

    @Test
    public void excluirContratoMockTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir(1);
        Assert.assertEquals("Excluído", retorno);
    }
}
